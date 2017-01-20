first compile using: mvn package
then generate the docker stuff using: mvn docker:build
to build the image go to the folder target/docker and digit: docker build .  (the dot is not a case!!
means build the Dockerfile in this folder)
to run the microservice digit:  docker run -p 8095:8095 -t movies (this will create a sort of tunnel
to access the embedded tomcat using localhost with specified port)
To access the microservice via browser digit in the address bar: http://localhost:8095/movies/movie-title

to enter the running container: docker exec -i -t  <container id> /bin/bash

docker run --name movies --network simonetwork -p :8095 -t movies

docker run --name shop  --network simonetwork -p :9096 -t shop

docker network create -d bridge --subnet 172.25.0.0/16 simonetwork

docker network connect simonetwork shop
