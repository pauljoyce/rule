package com.clinical.dao.master;
import com.clinical.model.master.TEM_24H_IN_OUT;
import java.util.List;

public interface ZjTem24hInOutMapper {
    List<TEM_24H_IN_OUT>  findZjTem24hInOutByUniqueId(String unique_id_lv2);

    List<String> findZjTem24hInOutByIncr();
}