package com.clinical.dao.master;
import com.clinical.model.master.DIET_ORDER;
import java.util.List;

public interface ZjDietOrderMapper {
    List<DIET_ORDER>  findZjDietOrderByUniqueId(String unique_id_lv2);

    List<String> findZjDietOrderByIncr();
}