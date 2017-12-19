FROM frolvlad/alpine-glibc:alpine-3.4

MAINTAINER Dan Boykis <danboykis@gmail.com>
RUN apk update && apk add git vim tree
RUN apk upgrade libssl1.0 --update-cache
RUN apk add wget ca-certificates
RUN apk add tar
RUN apk add curl
RUN apk add bash
RUN apk add openjdk8

WORKDIR /root

RUN mkdir -p /root/bin && wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein && \
	chmod +x lein && \
	mv lein bin
RUN git clone https://github.com/luminus-framework/guestbook.git

EXPOSE 3000
EXPOSE 7000
WORKDIR /root/guestbook
ENV LEIN_ROOT "yes"
RUN ~/bin/lein deps
RUN ~/bin/lein run migrate
CMD ~/bin/lein run
