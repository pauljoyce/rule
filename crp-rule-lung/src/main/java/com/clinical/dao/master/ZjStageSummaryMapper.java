package com.clinical.dao.master;
import com.clinical.model.master.STAGE_SUMMARY;
import java.util.List;

public interface ZjStageSummaryMapper {
    List<STAGE_SUMMARY>  findZjStageSummaryByUniqueId(String unique_id_lv2);

}