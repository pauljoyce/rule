package com.clinical.dao.master;
import com.clinical.model.master.ENDOSCOPY;
import java.util.List;

public interface ZjEndoscopyMapper {
    List<ENDOSCOPY>  findZjEndoscopyByUniqueId(String unique_id_lv2);

    List<String> findZjEndoscopyByIncr();
}