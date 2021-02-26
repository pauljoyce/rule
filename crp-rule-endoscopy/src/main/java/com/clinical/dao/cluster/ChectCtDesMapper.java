package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChectCtDes;
public interface ChectCtDesMapper {
    List<ChectCtDes>  findChectCtDes(String uniqueId);
    void   saveChectCtDes(ChectCtDes chectCtDes);
    void   updateChectCtDes(ChectCtDes chectCtDes);

}