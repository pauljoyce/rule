package com.clinical.dao.master;
import com.clinical.model.master.PATHOLOGY_LN;
import java.util.List;

public interface ZjPathologyLnMapper {
    List<PATHOLOGY_LN>  findZjPathologyLnByUniqueId(String unique_id_lv2);

}