package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexInjury;
public interface IndexInjuryMapper {
    List<IndexInjury>  findIndexInjuryByUniqueId(String uniqueId);
    void   saveIndexInjury(IndexInjury indexInjury);
    void   updateIndexInjury(IndexInjury indexInjury);
    void   deleteIndexInjury(List<String> unique_id);

}