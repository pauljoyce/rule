package com.clinical.service;
import com.clinical.model.cluster.Pathological;

import java.util.List;


public interface PathologicalService {



    public  void savePathological(Pathological pathological);

    public  void deletePathological(List<String> uniqueId);

}