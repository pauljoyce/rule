package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Dna;
public interface DnaMapper {
    List<Dna>  findDna(String uniqueId);
    void   saveDna(Dna dna);
    void   updateDna(Dna dna);

}