package com.clinical.service;
import com.clinical.model.cluster.Ablation;

import java.util.List;


public interface AblationService {



    public  void saveAblation(Ablation ablation);

    public  void deleteAblation(List<String> uniqueId);

}