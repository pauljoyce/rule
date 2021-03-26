package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalUsResult;
public interface AbdominalUsResultMapper {
    List<AbdominalUsResult>  findAbdominalUsResultByUniqueId(String uniqueId);
    void   saveAbdominalUsResult(AbdominalUsResult abdominalUsResult);
    void   updateAbdominalUsResult(AbdominalUsResult abdominalUsResult);
    void   deleteAbdominalUsResult(List<String> unique_id);

}