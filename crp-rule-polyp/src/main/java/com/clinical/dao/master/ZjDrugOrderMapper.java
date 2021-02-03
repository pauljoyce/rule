package com.clinical.dao.master;
import com.clinical.model.master.DRUG_ORDER;
import java.util.List;

public interface ZjDrugOrderMapper {
    List<DRUG_ORDER>  findZjDrugOrderByUniqueId(String unique_id_lv2);

}