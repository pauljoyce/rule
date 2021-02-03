package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.EusGastroscope;
public interface EusGastroscopeMapper {
    List<EusGastroscope>  findEusGastroscopeByUniqueId(String uniqueId);
    void   saveEusGastroscope(EusGastroscope eusGastroscope);
    void   updateEusGastroscope(EusGastroscope eusGastroscope);
    void   deleteEusGastroscope(String unique_id);

}