package com.clinical.service;
import com.clinical.model.cluster.TumorPuncture;

import java.util.List;


public interface TumorPunctureService {



    public  void saveTumorPuncture(TumorPuncture tumorPuncture);

    public  void deleteTumorPuncture(List<String> uniqueId);

}