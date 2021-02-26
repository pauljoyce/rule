package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Enteroscopy;
public interface EnteroscopyMapper {
    List<Enteroscopy>  findEnteroscopy(String uniqueId);
    void   saveEnteroscopy(Enteroscopy enteroscopy);
    void   updateEnteroscopy(Enteroscopy enteroscopy);

}