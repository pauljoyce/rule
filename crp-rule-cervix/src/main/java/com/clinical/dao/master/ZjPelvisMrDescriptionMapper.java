package com.clinical.dao.master;
import com.clinical.model.master.PELVIS_MR_DESCRIPTION;
import java.util.List;

public interface ZjPelvisMrDescriptionMapper {
    List<PELVIS_MR_DESCRIPTION>  findZjPelvisMrDescriptionByUniqueId(String unique_id_lv2);

}