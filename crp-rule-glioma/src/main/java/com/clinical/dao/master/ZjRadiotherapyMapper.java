package com.clinical.dao.master;
import com.clinical.model.master.RADIOTHERAPY;
import java.util.List;

public interface ZjRadiotherapyMapper {
    List<RADIOTHERAPY>  findZjRadiotherapyByUniqueId(String unique_id_lv2);

}