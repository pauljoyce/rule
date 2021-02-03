package com.clinical.dao.master;
import com.clinical.model.master.THY_US_DESCRIPTION;
import java.util.List;

public interface ZjThyUsDescriptionMapper {
    List<THY_US_DESCRIPTION>  findZjThyUsDescriptionByUniqueId(String unique_id_lv2);

}