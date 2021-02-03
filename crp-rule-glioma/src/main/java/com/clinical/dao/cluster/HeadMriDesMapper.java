package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HeadMriDes;
public interface HeadMriDesMapper {
    List<HeadMriDes>  findHeadMriDes(String uniqueId);
    void   saveHeadMriDes(HeadMriDes headMriDes);
    void   updateHeadMriDes(HeadMriDes headMriDes);

}