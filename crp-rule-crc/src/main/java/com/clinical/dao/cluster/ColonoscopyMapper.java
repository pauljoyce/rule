package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Colonoscopy;
public interface ColonoscopyMapper {
    List<Colonoscopy>  findColonoscopy(String uniqueId);
    void   saveColonoscopy(Colonoscopy colonoscopy);
    void   updateColonoscopy(Colonoscopy colonoscopy);

}