package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalMri;
public interface AbdominalMriMapper {
    List<AbdominalMri>  findAbdominalMriByUniqueId(String uniqueId);
    void   saveAbdominalMri(AbdominalMri abdominalMri);
    void   updateAbdominalMri(AbdominalMri abdominalMri);
    void   deleteAbdominalMri(String unique_id);

}