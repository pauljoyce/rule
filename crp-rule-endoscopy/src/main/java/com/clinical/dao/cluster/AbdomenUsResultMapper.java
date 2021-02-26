package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenUsResult;
public interface AbdomenUsResultMapper {
    List<AbdomenUsResult>  findAbdomenUsResult(String uniqueId);
    void   saveAbdomenUsResult(AbdomenUsResult abdomenUsResult);
    void   updateAbdomenUsResult(AbdomenUsResult abdomenUsResult);

}