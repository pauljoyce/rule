package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalMriResult;
public interface AbdominalMriResultMapper {
    List<AbdominalMriResult>  findAbdominalMriResultByUniqueId(String uniqueId);
    void   saveAbdominalMriResult(AbdominalMriResult abdominalMriResult);
    void   updateAbdominalMriResult(AbdominalMriResult abdominalMriResult);
    void   deleteAbdominalMriResult(List<String> unique_id);

}