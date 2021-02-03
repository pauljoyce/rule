package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Ablation;
public interface AblationMapper {
    List<Ablation>  findAblation(String uniqueId);
    void   saveAblation(Ablation ablation);
    void   updateAblation(Ablation ablation);

}