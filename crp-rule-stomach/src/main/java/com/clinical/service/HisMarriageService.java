package com.clinical.service;
import com.clinical.model.cluster.HisMarriage;


public interface HisMarriageService {



    public  void saveHisMarriage(HisMarriage hisMarriage);

    public  void deleteHisMarriage(String uniqueId);

}