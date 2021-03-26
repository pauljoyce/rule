package com.clinical.service;
import com.clinical.model.cluster.PersonGeneral;

import java.util.List;


public interface PersonGeneralService {



    public  void savePersonGeneral(PersonGeneral personGeneral);

    public  void deletePersonGeneral(List<String> uniqueId);

}