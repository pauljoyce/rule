package com.clinical.dao.master;
import com.clinical.model.master.GASTRIC_ES_DESCRIPTION;
import java.util.List;

public interface ZjGastricEsDescriptionMapper {
    List<GASTRIC_ES_DESCRIPTION>  findZjGastricEsDescriptionByUniqueId(String unique_id_lv2);

}