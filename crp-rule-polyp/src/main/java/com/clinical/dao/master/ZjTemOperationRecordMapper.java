package com.clinical.dao.master;
import com.clinical.model.master.TEM_OPERATION_RECORD;
import java.util.List;

public interface ZjTemOperationRecordMapper {
    List<TEM_OPERATION_RECORD>  findZjTemOperationRecordByUniqueId(String unique_id_lv2);
    List<TEM_OPERATION_RECORD>  findZjTemOperationRecordByALL();

}