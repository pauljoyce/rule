package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HeadCtResult;
public interface HeadCtResultMapper {
    List<HeadCtResult>  findHeadCtResult(String uniqueId);
    void   saveHeadCtResult(HeadCtResult headCtResult);
    void   updateHeadCtResult(HeadCtResult headCtResult);

}