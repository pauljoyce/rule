package com.clinical.dao.master;

import com.clinical.model.master.BASY_OP_STD;

import java.util.List;

public interface ZjBasyOpStdMapper {
    BASY_OP_STD  findZjBasyOpStdByUniqueId(String unique_id_lv2);

    List<BASY_OP_STD> findZjBasyOpStdsByUniqueId(String unique_id_lv2);

}