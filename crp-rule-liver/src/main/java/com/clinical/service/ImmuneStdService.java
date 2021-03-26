package com.clinical.service;
import com.clinical.model.cluster.ImmuneStd;

import java.util.List;


public interface ImmuneStdService {



    public  void saveImmuneStd(ImmuneStd immuneStd);

    public  void deleteImmuneStd(List<String> uniqueId);

}