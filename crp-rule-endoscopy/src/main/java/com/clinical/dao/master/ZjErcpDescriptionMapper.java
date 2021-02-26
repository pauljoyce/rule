package com.clinical.dao.master;
import com.clinical.model.master.ERCP_DESCRIPTION;
import java.util.List;

public interface ZjErcpDescriptionMapper {
    List<ERCP_DESCRIPTION>  findZjErcpDescriptionByUniqueId(String unique_id_lv2);

}