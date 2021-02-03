package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Id;
public interface IdMapper {
    List<Id>  findId(String uniqueId);
    void   saveId(Id id);
    void   updateId(Id id);

}