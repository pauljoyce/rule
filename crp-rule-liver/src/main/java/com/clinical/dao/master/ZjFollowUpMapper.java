package com.clinical.dao.master;
import com.clinical.model.master.FOLLOW_UP;
import java.util.List;

public interface ZjFollowUpMapper {
    List<FOLLOW_UP>  findZjFollowUpByUniqueId(String unique_id_lv2);

    List<String> findZjFollowUpByIncr();
}