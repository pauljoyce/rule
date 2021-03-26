package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexOperationIcd;
public interface IndexOperationIcdMapper {
    List<IndexOperationIcd>  findIndexOperationIcdByUniqueId(String uniqueId);
    void   saveIndexOperationIcd(IndexOperationIcd indexOperationIcd);
    void   updateIndexOperationIcd(IndexOperationIcd indexOperationIcd);
    void   deleteIndexOperationIcd(List<String> unique_id);

}