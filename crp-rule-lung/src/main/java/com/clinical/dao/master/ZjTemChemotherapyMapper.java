package com.clinical.dao.master;
import com.clinical.model.master.TEM_CHEMOTHERAPY;
import java.util.List;

public interface ZjTemChemotherapyMapper {
    List<TEM_CHEMOTHERAPY>  findZjTemChemotherapyByUniqueId(String unique_id_lv2);

}