package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PetCtDes;
public interface PetCtDesMapper {
    List<PetCtDes>  findPetCtDesByUniqueId(String uniqueId);
    void   savePetCtDes(PetCtDes petCtDes);
    void   updatePetCtDes(PetCtDes petCtDes);
    void   deletePetCtDes(List<String> unique_id);

}