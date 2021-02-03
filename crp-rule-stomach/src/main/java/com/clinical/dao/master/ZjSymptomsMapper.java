package com.clinical.dao.master;
import com.clinical.model.master.SYMPTOMS;
import java.util.List;

public interface ZjSymptomsMapper {
    List<SYMPTOMS>  findZjSymptomsByUniqueId(String unique_id_lv2);

    List<String> findZjSymptomsByIncr();
}