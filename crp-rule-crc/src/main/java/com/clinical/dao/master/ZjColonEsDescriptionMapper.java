package com.clinical.dao.master;
import com.clinical.model.master.COLON_ES_DESCRIPTION;
import java.util.List;

public interface ZjColonEsDescriptionMapper {
    List<COLON_ES_DESCRIPTION>  findZjColonEsDescriptionByUniqueId(String unique_id_lv2);

}