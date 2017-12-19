# Luminus guestbook

This is a docker image used to create a luminus guestbook application
origin	https://github.com/luminus-framework/luminus-docker.git (fetch)

# How to install

1. [Install docker](https://docs.docker.com/engine/installation/)
2. Clone this project
3. `cd luminus-docker && docker build .`
4. `docker run -p 3000:3000 -p 7000:7000 -it id-from-step-3`

5.` docker run -p 3000:3000 -p 7000:7000 -itP -v $(pwd):/root/lab`
