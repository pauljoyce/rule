package com.clinical.service;
import com.clinical.model.cluster.FollowUp;

import java.util.List;


public interface FollowUpService {



    public  void saveFollowUp(FollowUp followUp);

    public  void deleteFollowUp(List<String> uniqueId);

}