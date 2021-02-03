package com.clinical.dao.master;
import com.clinical.model.master.TRANSFUSION_ORDER;
import java.util.List;

public interface ZjTransfusionOrderMapper {
    List<TRANSFUSION_ORDER>  findZjTransfusionOrderByUniqueId(String unique_id_lv2);

    List<String> findZjTransfusionOrderByIncr();
}