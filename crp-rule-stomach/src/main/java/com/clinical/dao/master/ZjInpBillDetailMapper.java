package com.clinical.dao.master;
import com.clinical.model.master.INP_BILL_DETAIL;
import java.util.List;

public interface ZjInpBillDetailMapper {
    List<INP_BILL_DETAIL>  findZjInpBillDetailByUniqueId(String unique_id_lv2);

    List<String> findZjInpBillDetailByIncr();
}