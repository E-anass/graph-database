package com.neo4j.data.graphmeta.repository;

import com.neo4j.data.graphmeta.model.Change;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ChangeRepository extends Neo4jRepository<Change, Long> {
}
