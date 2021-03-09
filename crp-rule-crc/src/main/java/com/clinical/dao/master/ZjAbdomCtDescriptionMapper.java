package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_CT_DESCRIPTION;
import java.util.List;

public interface ZjAbdomCtDescriptionMapper {
    List<ABDOM_CT_DESCRIPTION>  findZjAbdomCtDescriptionByUniqueId(String unique_id_lv2);
    List<ABDOM_CT_DESCRIPTION>  findZjAbdomCtDescriptionByALL();
    List<ABDOM_CT_DESCRIPTION>  findZjAbdomCtDescriptionById(String unique_id);

}