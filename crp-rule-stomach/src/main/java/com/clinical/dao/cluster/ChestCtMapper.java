package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChestCt;
public interface ChestCtMapper {
    List<ChestCt>  findChestCtByUniqueId(String uniqueId);
    void   saveChestCt(ChestCt chestCt);
    void   updateChestCt(ChestCt chestCt);
    void   deleteChestCt(String unique_id);

}