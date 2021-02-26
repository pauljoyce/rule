package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenMriDes;
public interface AbdomenMriDesMapper {
    List<AbdomenMriDes>  findAbdomenMriDes(String uniqueId);
    void   saveAbdomenMriDes(AbdomenMriDes abdomenMriDes);
    void   updateAbdomenMriDes(AbdomenMriDes abdomenMriDes);

}