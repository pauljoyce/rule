package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ImmuneStd;
public interface ImmuneStdMapper {
    List<ImmuneStd>  findImmuneStdByUniqueId(String uniqueId);
    void   saveImmuneStd(ImmuneStd immuneStd);
    void   updateImmuneStd(ImmuneStd immuneStd);
    void   deleteImmuneStd(List<String> unique_id);

}