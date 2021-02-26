package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomNen;
public interface SymptomNenMapper {
    List<SymptomNen>  findSymptomNen(String uniqueId);
    void   saveSymptomNen(SymptomNen symptomNen);
    void   updateSymptomNen(SymptomNen symptomNen);

}