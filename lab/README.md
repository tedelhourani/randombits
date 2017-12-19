# lab

generated using Luminus version "2.9.11.98"

FIXME

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen


## Developing

To start developing, first build an docker image with the Dockerfile.dev
    
    docker build -t lab -f Dockerfile.dev .

then use this dev image "lab":

    docker run  -p 3000:3000 -p 7000:7000 -itP -v $(pwd):/root/lab lab

## Running

To start a web server for the application, run:

    lein run 

## License

Copyright © 2017 FIXME
