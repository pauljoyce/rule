package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Encephlogram;
public interface EncephlogramMapper {
    List<Encephlogram>  findEncephlogram(String uniqueId);
    void   saveEncephlogram(Encephlogram encephlogram);
    void   updateEncephlogram(Encephlogram encephlogram);

}