package com.clinical.dao.master;
import com.clinical.model.master.OUTP_DIAGNOSIS_SPLIT;
import java.util.List;

public interface ZjOutpDiagnosisSplitMapper {
    List<OUTP_DIAGNOSIS_SPLIT>  findZjOutpDiagnosisSplitByUniqueId(String unique_id_lv2);

    List<String> findZjOutpDiagnosisSplitByIncr();
}