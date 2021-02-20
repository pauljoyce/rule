package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenCtDes;
public interface AbdomenCtDesMapper {
    List<AbdomenCtDes>  findAbdomenCtDes(String uniqueId);
    void   saveAbdomenCtDes(AbdomenCtDes abdomenCtDes);
    void   updateAbdomenCtDes(AbdomenCtDes abdomenCtDes);

}