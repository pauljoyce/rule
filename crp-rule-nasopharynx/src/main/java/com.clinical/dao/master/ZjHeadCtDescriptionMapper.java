package com.clinical.dao.master;
import com.clinical.model.master.HEAD_CT_DESCRIPTION;
import java.util.List;

public interface ZjHeadCtDescriptionMapper {
    List<HEAD_CT_DESCRIPTION>  findZjHeadCtDescriptionByUniqueId(String unique_id_lv2);

}