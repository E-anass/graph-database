package com.neo4j.data.graphmeta;

import com.graph.core.util.NodeMaper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GraphMetaApplication {

    public static void main(String[] args) {
        NodeMaper nodeMaper=null;
        SpringApplication.run(GraphMetaApplication.class, args);
    }

}
