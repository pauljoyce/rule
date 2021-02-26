package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdomenUsDes;
public interface AbdomenUsDesMapper {
    List<AbdomenUsDes>  findAbdomenUsDes(String uniqueId);
    void   saveAbdomenUsDes(AbdomenUsDes abdomenUsDes);
    void   updateAbdomenUsDes(AbdomenUsDes abdomenUsDes);

}