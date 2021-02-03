package com.clinical.dao.master;
import com.clinical.model.master.TRANSFER_DEPT;
import java.util.List;

public interface ZjTransferDeptMapper {
    List<TRANSFER_DEPT>  findZjTransferDeptByUniqueId(String unique_id_lv2);

    List<String> findZjTransferDeptByIncr();
}