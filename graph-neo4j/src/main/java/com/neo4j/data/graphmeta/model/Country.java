package com.neo4j.data.graphmeta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {

    @Id
    private Long id;
    private Long totalCase;
    private Long deaths;
    private Long recovred;
    private Long critical;
    private Long tested;
    private double deathRatio;
    private double recovryRation;

    @Relationship(direction =Relationship.OUTGOING)
    private List<Change> changes;

}
