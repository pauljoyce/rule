package com.clinical.dao.master;
import com.clinical.model.master.GASTRIC_EUS_DESCRIPTION;
import java.util.List;

public interface ZjGastricEusDescriptionMapper {
    List<GASTRIC_EUS_DESCRIPTION>  findZjGastricEusDescriptionByUniqueId(String unique_id_lv2);

}