package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexOperation;
public interface IndexOperationMapper {
    List<IndexOperation>  findIndexOperation(String uniqueId);
    void   saveIndexOperation(IndexOperation indexOperation);
    void   updateIndexOperation(IndexOperation indexOperation);

}