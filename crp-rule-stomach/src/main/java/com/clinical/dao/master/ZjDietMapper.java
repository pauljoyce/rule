package com.clinical.dao.master;
import com.clinical.model.master.DIET;
import java.util.List;

public interface ZjDietMapper {
    List<DIET>  findZjDietByUniqueId(String unique_id_lv2);

    List<String> findZjDietByIncr();
}