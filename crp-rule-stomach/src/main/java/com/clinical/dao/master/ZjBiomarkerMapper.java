package com.clinical.dao.master;
import com.clinical.model.master.BIOMARKER;
import java.util.List;

public interface ZjBiomarkerMapper {
    List<BIOMARKER>  findZjBiomarkerByUniqueId(String unique_id_lv2);

    List<String> findZjBiomarkerByIncr();
}