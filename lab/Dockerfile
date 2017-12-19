FROM java:8-alpine
MAINTAINER Ted Elhourani <theodore.elhourani@gmail.com>

ADD target/uberjar/lab.jar /lab/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/lab/app.jar"]
