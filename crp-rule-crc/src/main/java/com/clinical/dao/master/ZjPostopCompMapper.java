package com.clinical.dao.master;
import com.clinical.model.master.POSTOP_COMP;
import java.util.List;

public interface ZjPostopCompMapper {
    List<POSTOP_COMP>  findZjPostopCompByUniqueId(String unique_id_lv2);

}