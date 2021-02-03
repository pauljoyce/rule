package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexIcu;
public interface IndexIcuMapper {
    List<IndexIcu>  findIndexIcu(String uniqueId);
    void   saveIndexIcu(IndexIcu indexIcu);
    void   updateIndexIcu(IndexIcu indexIcu);

}