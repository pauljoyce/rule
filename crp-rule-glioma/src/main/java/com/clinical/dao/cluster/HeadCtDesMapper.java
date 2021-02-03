package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HeadCtDes;
public interface HeadCtDesMapper {
    List<HeadCtDes>  findHeadCtDes(String uniqueId);
    void   saveHeadCtDes(HeadCtDes headCtDes);
    void   updateHeadCtDes(HeadCtDes headCtDes);

}