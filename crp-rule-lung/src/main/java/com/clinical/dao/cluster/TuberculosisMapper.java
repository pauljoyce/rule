package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Tuberculosis;
public interface TuberculosisMapper {
    List<Tuberculosis>  findTuberculosis(String uniqueId);
    void   saveTuberculosis(Tuberculosis tuberculosis);
    void   updateTuberculosis(Tuberculosis tuberculosis);

}