package com.clinical.service;
import com.clinical.model.cluster.Rabat;

import java.util.List;


public interface RabatService {



    public  void saveRabat(Rabat rabat);

    public  void deleteRabat(List<String> uniqueId);

}