package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HeartFailure;
public interface HeartFailureMapper {
    List<HeartFailure>  findHeartFailure(String uniqueId);
    void   saveHeartFailure(HeartFailure heartFailure);
    void   updateHeartFailure(HeartFailure heartFailure);

}