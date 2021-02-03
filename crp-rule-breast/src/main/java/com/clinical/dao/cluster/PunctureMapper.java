package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Puncture;
public interface PunctureMapper {
    List<Puncture>  findPuncture(String uniqueId);
    void   savePuncture(Puncture puncture);
    void   updatePuncture(Puncture puncture);

}