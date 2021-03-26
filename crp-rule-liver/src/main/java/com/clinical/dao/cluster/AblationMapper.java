package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Ablation;
public interface AblationMapper {
    List<Ablation>  findAblationByUniqueId(String uniqueId);
    void   saveAblation(Ablation ablation);
    void   updateAblation(Ablation ablation);
    void   deleteAblation(List<String> unique_id);

}