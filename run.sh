echo "KILL 8085"
kill $(lsof -t -i:8085)
echo "KILL 8084"
kill $(lsof -t -i:8084)
echo "KILL 8086"
kill $(lsof -t -i:8085)
lsof -t -i

serviceRun(){
echo "START RUN GRAPH NEO4J "
java -jar ~/MyWorkspace/corona-virus-world-mater/graph-neo4j/target/graph-neo4j-0.0.1-SNAPSHOT.jar
echo "END RUN GRAPH NEO4J "
}
neo4jRun(){
echo "START RUN GRAPH NEO4J "
java -jar ~/MyWorkspace/corona-virus-world-mater/graph-neo4j/target/graph-neo4j-0.0.1-SNAPSHOT.jar
echo "END RUN GRAPH NEO4J "
}

mysql(){
echo "START RUN GRAPH MYSQL "
java -jar ~/MyWorkspace/corona-virus-world-mater/graph-mysql/target/graph-mysql-0.0.1-SNAPSHOT.jar
echo "END RUN GRAPH MYSQL "

}

serviceRun & neo4jRun & mysql
