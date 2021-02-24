package com.clinical.dao.master;
import com.clinical.model.master.HISTOLOGY_REPORT;
import java.util.List;

public interface ZjHistologyReportMapper {
    List<HISTOLOGY_REPORT>  findZjHistologyReportByUniqueId(String unique_id_lv2);

    HISTOLOGY_REPORT  findZjHistologyReportByUniqueId2(String unique_id);
}