package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomPepticUlcer;
public interface SymptomPepticUlcerMapper {
    List<SymptomPepticUlcer>  findSymptomPepticUlcer(String uniqueId);
    void   saveSymptomPepticUlcer(SymptomPepticUlcer symptomPepticUlcer);
    void   updateSymptomPepticUlcer(SymptomPepticUlcer symptomPepticUlcer);

}