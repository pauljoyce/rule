package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Eus;
public interface EusMapper {
    List<Eus>  findEus(String uniqueId);
    void   saveEus(Eus eus);
    void   updateEus(Eus eus);

}