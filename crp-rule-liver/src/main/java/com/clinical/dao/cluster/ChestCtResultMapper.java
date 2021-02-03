package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChestCtResult;
public interface ChestCtResultMapper {
    List<ChestCtResult>  findChestCtResult(String uniqueId);
    void   saveChestCtResult(ChestCtResult chestCtResult);
    void   updateChestCtResult(ChestCtResult chestCtResult);

}