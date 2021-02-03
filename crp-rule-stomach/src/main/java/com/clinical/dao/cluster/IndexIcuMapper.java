package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexIcu;
public interface IndexIcuMapper {
    List<IndexIcu>  findIndexIcuByUniqueId(String uniqueId);
    void   saveIndexIcu(IndexIcu indexIcu);
    void   updateIndexIcu(IndexIcu indexIcu);
    void   deleteIndexIcu(String unique_id);

}