package com.clinical.dao.master;
import com.clinical.model.master.TEM_RADIOTHERAPY;
import java.util.List;

public interface ZjTemRadiotherapyMapper {
    List<TEM_RADIOTHERAPY>  findZjTemRadiotherapyByUniqueId(String unique_id_lv2);

}