package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChestCtDes;
public interface ChestCtDesMapper {
    List<ChestCtDes>  findChestCtDesByUniqueId(String uniqueId);
    void   saveChestCtDes(ChestCtDes chestCtDes);
    void   updateChestCtDes(ChestCtDes chestCtDes);
    void   deleteChestCtDes(List<String> unique_id);

}