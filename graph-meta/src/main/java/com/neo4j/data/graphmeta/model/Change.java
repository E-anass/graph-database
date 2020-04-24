package com.neo4j.data.graphmeta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Change {

    @Id
    private Long id;
    private Long totalCase;
    private Long deaths;
    private Long recovred;
    private double deathRatio;
    private double recovryRation;

}
