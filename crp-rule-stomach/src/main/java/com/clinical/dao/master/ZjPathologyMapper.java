package com.clinical.dao.master;
import com.clinical.model.master.PATHOLOGY;
import java.util.List;

public interface ZjPathologyMapper {
    List<PATHOLOGY>  findZjPathologyByUniqueId(String unique_id_lv2);

    List<String> findZjPathologyByIncr();
}