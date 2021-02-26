package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Ercp;
public interface ErcpMapper {
    List<Ercp>  findErcp(String uniqueId);
    void   saveErcp(Ercp ercp);
    void   updateErcp(Ercp ercp);

}