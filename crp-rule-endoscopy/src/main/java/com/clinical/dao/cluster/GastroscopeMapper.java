package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Gastroscope;
public interface GastroscopeMapper {
    List<Gastroscope>  findGastroscope(String uniqueId);
    void   saveGastroscope(Gastroscope gastroscope);
    void   updateGastroscope(Gastroscope gastroscope);

}