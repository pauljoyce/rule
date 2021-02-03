package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChestCtDes;
public interface ChestCtDesMapper {
    List<ChestCtDes>  findChestCtDes(String uniqueId);
    void   saveChestCtDes(ChestCtDes chestCtDes);
    void   updateChestCtDes(ChestCtDes chestCtDes);

}