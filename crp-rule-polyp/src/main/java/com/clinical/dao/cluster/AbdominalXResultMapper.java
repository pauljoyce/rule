package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalXResult;
public interface AbdominalXResultMapper {
    List<AbdominalXResult>  findAbdominalXResult(String uniqueId);
    void   saveAbdominalXResult(AbdominalXResult abdominalXResult);
    void   updateAbdominalXResult(AbdominalXResult abdominalXResult);

}