package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Rabat;
public interface RabatMapper {
    List<Rabat>  findRabatByUniqueId(String uniqueId);
    void   saveRabat(Rabat rabat);
    void   updateRabat(Rabat rabat);
    void   deleteRabat(String unique_id);

}