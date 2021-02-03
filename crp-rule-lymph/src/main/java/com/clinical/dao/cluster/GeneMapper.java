package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Gene;
public interface GeneMapper {
    List<Gene>  findGene(String uniqueId);
    void   saveGene(Gene gene);
    void   updateGene(Gene gene);

}