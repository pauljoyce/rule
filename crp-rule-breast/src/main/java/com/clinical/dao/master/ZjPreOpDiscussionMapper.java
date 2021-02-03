package com.clinical.dao.master;
import com.clinical.model.master.PRE_OP_DISCUSSION;
import java.util.List;

public interface ZjPreOpDiscussionMapper {
    List<PRE_OP_DISCUSSION>  findZjPreOpDiscussionByUniqueId(String unique_id_lv2);

}