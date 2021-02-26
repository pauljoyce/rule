package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PetCtDes;
public interface PetCtDesMapper {
    List<PetCtDes>  findPetCtDes(String uniqueId);
    void   savePetCtDes(PetCtDes petCtDes);
    void   updatePetCtDes(PetCtDes petCtDes);

}