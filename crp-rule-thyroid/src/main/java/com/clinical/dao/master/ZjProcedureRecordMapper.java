package com.clinical.dao.master;
import com.clinical.model.master.PROCEDURE_RECORD;
import java.util.List;

public interface ZjProcedureRecordMapper {
    List<PROCEDURE_RECORD>  findZjProcedureRecordByUniqueId(String unique_id_lv2);

}