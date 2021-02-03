package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexPathology;
public interface IndexPathologyMapper {
    List<IndexPathology>  findIndexPathologyByUniqueId(String uniqueId);
    void   saveIndexPathology(IndexPathology indexPathology);
    void   updateIndexPathology(IndexPathology indexPathology);
    void   deleteIndexPathology(String unique_id);

}