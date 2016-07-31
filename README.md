# esservice


Docker 1.12 should be installed to use this project.

A docker swarm will be needed for scaling.

To run the program execute the commands:

Optionally, you can build compile and build this project

    ./build.sh

If you don't have an elasticsearch service, you can start with this docker command:

    docker run --rm -p 9200:9200 -p 9300:9300 elasticsearch

Parameter elasticsearchhosts should include comma seperated hosts like server1:port1,server2:port2
Then run with docker:

    docker run -it -p 8080:8080 berkgokden/weatherforecastservice --nodes=elasticserchhosts

Check the service with:

    curl 'http://localhost:8080/forecast?location=062250&forecastdate=2015-09-03'

To have a scalable load balanced system, we will use docker 1.12 swarm mode.

Assuming you are on a swarm cluster, create docker service with 10 instances:

    docker service create --replicas 10 --name weatherservice  -p 8080:8080/tcp berkgokden/weatherforecastservice --nodes=elasticserchhosts

All nodes will run the same instance and they will be node balaced.

You can add a dns load balancing in a production environment.

Note that it may take some time to scale.

You can rescale to 3 instances with:

    docker service scale weatherservice=3

Finally, to run the tests execute the command:

    mvn test

