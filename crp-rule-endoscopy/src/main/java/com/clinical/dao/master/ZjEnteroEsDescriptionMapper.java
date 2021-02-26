package com.clinical.dao.master;
import com.clinical.model.master.ENTERO_ES_DESCRIPTION;
import java.util.List;

public interface ZjEnteroEsDescriptionMapper {
    List<ENTERO_ES_DESCRIPTION>  findZjEnteroEsDescriptionByUniqueId(String unique_id_lv2);

}