package com.clinical.dao.master;
import com.clinical.model.master.HEAD_MR_DESCRIPTION;
import java.util.List;

public interface ZjHeadMrDescriptionMapper {
    List<HEAD_MR_DESCRIPTION>  findZjHeadMrDescriptionByUniqueId(String unique_id_lv2);

}