package com.clinical.dao.master;
import com.clinical.model.master.INP_DIAGNOSIS;
import java.util.List;

public interface ZjInpDiagnosisMapper {
    List<INP_DIAGNOSIS>  findZjInpDiagnosisByUniqueId(String unique_id_lv2);

    List<String> findZjInpDiagnosisByIncr();
}