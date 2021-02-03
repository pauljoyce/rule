package com.clinical.dao.master;
import com.clinical.model.master.POSSIBLE_CAUSE;
import java.util.List;

public interface ZjPossibleCauseMapper {
    List<POSSIBLE_CAUSE>  findZjPossibleCauseByUniqueId(String unique_id_lv2);

    List<String> findZjPossibleCauseByIncr();
}