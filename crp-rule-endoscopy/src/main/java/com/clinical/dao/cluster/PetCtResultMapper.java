package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PetCtResult;
public interface PetCtResultMapper {
    List<PetCtResult>  findPetCtResult(String uniqueId);
    void   savePetCtResult(PetCtResult petCtResult);
    void   updatePetCtResult(PetCtResult petCtResult);

}