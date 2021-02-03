package com.clinical.dao.master;
import com.clinical.model.master.INP_ORDERS;
import java.util.List;

public interface ZjInpOrdersMapper {
    List<INP_ORDERS>  findZjInpOrdersByUniqueId(String unique_id_lv2);

}