package com.clinical.dao.master;
import com.clinical.model.master.BASY_NSTD;
import java.util.List;

public interface ZjBasyNstdMapper {
    BASY_NSTD  findZjBasyNstdByUniqueId(String unique_id_lv2);

    List<BASY_NSTD> findZjBasyNstdsByUniqueId(String unique_id_lv2);

}