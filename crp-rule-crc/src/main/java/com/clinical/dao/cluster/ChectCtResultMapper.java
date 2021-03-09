package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChectCtResult;
public interface ChectCtResultMapper {
    List<ChectCtResult>  findChectCtResult(String uniqueId);

    void   saveChectCtResult(ChectCtResult chectCtResult);
    void   updateChectCtResult(ChectCtResult chectCtResult);

}
