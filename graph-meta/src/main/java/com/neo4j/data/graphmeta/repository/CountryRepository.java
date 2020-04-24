package com.neo4j.data.graphmeta.repository;

import com.neo4j.data.graphmeta.model.Country;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CountryRepository extends Neo4jRepository<Country, Long> {
}
