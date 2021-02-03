package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexPerson;
public interface IndexPersonMapper {
    List<IndexPerson>  findIndexPerson(String uniqueId);
    void   saveIndexPerson(IndexPerson indexPerson);
    void   updateIndexPerson(IndexPerson indexPerson);

}