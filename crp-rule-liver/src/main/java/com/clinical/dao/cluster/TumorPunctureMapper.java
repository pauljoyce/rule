package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TumorPuncture;
public interface TumorPunctureMapper {
    List<TumorPuncture>  findTumorPunctureByUniqueId(String uniqueId);
    void   saveTumorPuncture(TumorPuncture tumorPuncture);
    void   updateTumorPuncture(TumorPuncture tumorPuncture);
    void   deleteTumorPuncture(List<String> unique_id);

}