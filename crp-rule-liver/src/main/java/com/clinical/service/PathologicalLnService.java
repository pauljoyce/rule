package com.clinical.service;
import com.clinical.model.cluster.PathologicalLn;

import java.util.List;


public interface PathologicalLnService {



    public  void savePathologicalLn(PathologicalLn pathologicalLn);

    public  void deletePathologicalLn(List<String> uniqueId);

}