package com.clinical.dao.master;
import com.clinical.model.master.PET_CT_DESCRIPTION;
import java.util.List;

public interface ZjPetCtDescriptionMapper {
    List<PET_CT_DESCRIPTION>  findZjPetCtDescriptionByUniqueId(String unique_id_lv2);

    List<PET_CT_DESCRIPTION>  findZjPetCtDescriptionByUniqueId2(String unique_id);

    List<String> findZjPetCtDescriptionByIncr();
}