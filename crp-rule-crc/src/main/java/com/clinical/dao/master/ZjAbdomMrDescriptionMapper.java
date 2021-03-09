package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_MR_DESCRIPTION;
import java.util.List;

public interface ZjAbdomMrDescriptionMapper {
    List<ABDOM_MR_DESCRIPTION>  findZjAbdomMrDescriptionByUniqueId(String unique_id_lv2);
    List<ABDOM_MR_DESCRIPTION>  findZjAbdomMrDescriptionById(String unique_id);
    List<ABDOM_MR_DESCRIPTION>  findZjAbdomMrDescriptionByALL();

}