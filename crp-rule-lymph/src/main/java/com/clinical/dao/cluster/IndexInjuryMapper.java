package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexInjury;
public interface IndexInjuryMapper {
    List<IndexInjury>  findIndexInjury(String uniqueId);
    void   saveIndexInjury(IndexInjury indexInjury);
    void   updateIndexInjury(IndexInjury indexInjury);

}