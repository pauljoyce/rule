package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HeadMriResult;
public interface HeadMriResultMapper {
    List<HeadMriResult>  findHeadMriResult(String uniqueId);
    void   saveHeadMriResult(HeadMriResult headMriResult);
    void   updateHeadMriResult(HeadMriResult headMriResult);

}