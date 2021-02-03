package com.clinical.dao.master;
import com.clinical.model.master.BASY_DIAG_STD;
import java.util.List;

public interface ZjBasyDiagStdMapper {
    BASY_DIAG_STD  findZjBasyDiagStdByUniqueId(String unique_id_lv2);
    List<BASY_DIAG_STD>  findZjBasyDiagStdsByUniqueId(String unique_id_lv2);

}