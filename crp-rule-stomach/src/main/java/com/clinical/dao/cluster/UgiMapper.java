package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Ugi;
public interface UgiMapper {
    List<Ugi>  findUgiByUniqueId(String uniqueId);
    void   saveUgi(Ugi ugi);
    void   updateUgi(Ugi ugi);
    void   deleteUgi(String unique_id);

}