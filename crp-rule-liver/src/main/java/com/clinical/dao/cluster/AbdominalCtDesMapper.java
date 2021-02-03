package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalCtDes;
public interface AbdominalCtDesMapper {
    List<AbdominalCtDes>  findAbdominalCtDes(String uniqueId);
    void   saveAbdominalCtDes(AbdominalCtDes abdominalCtDes);
    void   updateAbdominalCtDes(AbdominalCtDes abdominalCtDes);

}