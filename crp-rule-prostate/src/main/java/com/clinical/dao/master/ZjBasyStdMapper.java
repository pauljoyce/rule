package com.clinical.dao.master;
import com.clinical.model.master.BASY_STD;
import java.util.List;

public interface ZjBasyStdMapper {
    List<BASY_STD>  findZjBasyStdByUniqueId(String unique_id_lv2);

}