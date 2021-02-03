package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Radiotherapy;
public interface RadiotherapyMapper {
    List<Radiotherapy>  findRadiotherapy(String uniqueId);
    void   saveRadiotherapy(Radiotherapy radiotherapy);
    void   updateRadiotherapy(Radiotherapy radiotherapy);

}