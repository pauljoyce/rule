package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalCtResult;
public interface AbdominalCtResultMapper {
    List<AbdominalCtResult>  findAbdominalCtResultByUniqueId(String uniqueId);
    void   saveAbdominalCtResult(AbdominalCtResult abdominalCtResult);
    void   updateAbdominalCtResult(AbdominalCtResult abdominalCtResult);
    void   deleteAbdominalCtResult(List<String> unique_id);

}