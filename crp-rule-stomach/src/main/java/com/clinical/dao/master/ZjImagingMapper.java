package com.clinical.dao.master;
import com.clinical.model.master.IMAGING;
import java.util.List;

public interface ZjImagingMapper {
    List<IMAGING>  findZjImagingByUniqueId(String unique_id_lv2);

    List<String> findZjImagingByIncr();
}