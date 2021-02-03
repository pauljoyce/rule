package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.MarrowPuncture;
public interface MarrowPunctureMapper {
    List<MarrowPuncture>  findMarrowPuncture(String uniqueId);
    void   saveMarrowPuncture(MarrowPuncture marrowPuncture);
    void   updateMarrowPuncture(MarrowPuncture marrowPuncture);

}