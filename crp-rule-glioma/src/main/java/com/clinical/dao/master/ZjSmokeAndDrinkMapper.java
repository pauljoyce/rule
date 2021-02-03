package com.clinical.dao.master;
import com.clinical.model.master.SMOKE_AND_DRINK;
import java.util.List;

public interface ZjSmokeAndDrinkMapper {
    List<SMOKE_AND_DRINK>  findZjSmokeAndDrinkByUniqueId(String unique_id_lv2);

}