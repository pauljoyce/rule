package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenCtResult;
public interface AbdomenCtResultMapper {
    List<AbdomenCtResult>  findAbdomenCtResult(String uniqueId);
    void   saveAbdomenCtResult(AbdomenCtResult abdomenCtResult);
    void   updateAbdomenCtResult(AbdomenCtResult abdomenCtResult);

}