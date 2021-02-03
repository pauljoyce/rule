package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexOperationIcd;
public interface IndexOperationIcdMapper {
    List<IndexOperationIcd>  findIndexOperationIcd(String uniqueId);
    void   saveIndexOperationIcd(IndexOperationIcd indexOperationIcd);
    void   updateIndexOperationIcd(IndexOperationIcd indexOperationIcd);

}