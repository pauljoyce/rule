package com.clinical.service;
import com.clinical.model.cluster.PathologicalStd;


public interface PathologicalStdService {



    public  void savePathologicalStd(PathologicalStd pathologicalStd);

    public  void deletePathologicalStd(String uniqueId);

}