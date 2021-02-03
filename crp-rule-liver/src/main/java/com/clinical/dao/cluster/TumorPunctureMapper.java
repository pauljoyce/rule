package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TumorPuncture;
public interface TumorPunctureMapper {
    List<TumorPuncture>  findTumorPuncture(String uniqueId);
    void   saveTumorPuncture(TumorPuncture tumorPuncture);
    void   updateTumorPuncture(TumorPuncture tumorPuncture);

}