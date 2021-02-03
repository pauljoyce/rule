package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PetCt;
public interface PetCtMapper {
    List<PetCt>  findPetCtByUniqueId(String uniqueId);
    void   savePetCt(PetCt petCt);
    void   updatePetCt(PetCt petCt);
    void   deletePetCt(String unique_id);

}