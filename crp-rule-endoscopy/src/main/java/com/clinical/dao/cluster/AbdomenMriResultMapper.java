package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenMriResult;
public interface AbdomenMriResultMapper {
    List<AbdomenMriResult>  findAbdomenMriResult(String uniqueId);
    void   saveAbdomenMriResult(AbdomenMriResult abdomenMriResult);
    void   updateAbdomenMriResult(AbdomenMriResult abdomenMriResult);

}