package com.clinical.dao.master;
import com.clinical.model.master.POSTOP_FUNCTION;
import java.util.List;

public interface ZjPostopFunctionMapper {
    List<POSTOP_FUNCTION>  findZjPostopFunctionByUniqueId(String unique_id_lv2);

}