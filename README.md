
Sample micro service with persistence data to kickstart any microservice demo

== Run in Wildlfy 10 and hot deploy war during DEV

mvn clean package

== Test with wilfly-swarm

mvn clean package -Puberjar && java -jar target/microservice-swarm.jar

== Docker image with wildfly-swarm 

mvn clean package -Puberjar && docker/run.sh
