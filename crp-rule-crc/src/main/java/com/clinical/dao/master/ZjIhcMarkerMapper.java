package com.clinical.dao.master;
import com.clinical.model.master.IHC_MARKER;
import java.util.List;

public interface ZjIhcMarkerMapper {
    List<IHC_MARKER>  findZjIhcMarkerByUniqueId(String unique_id_lv2);

}