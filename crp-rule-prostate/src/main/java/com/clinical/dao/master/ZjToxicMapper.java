package com.clinical.dao.master;
import com.clinical.model.master.TOXIC;
import java.util.List;

public interface ZjToxicMapper {
    List<TOXIC>  findZjToxicByUniqueId(String unique_id_lv2);

}