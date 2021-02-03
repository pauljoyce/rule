package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PersonGeneral;
public interface PersonGeneralMapper {
    List<PersonGeneral>  findPersonGeneral(String uniqueId);
    void   savePersonGeneral(PersonGeneral personGeneral);
    void   updatePersonGeneral(PersonGeneral personGeneral);

}