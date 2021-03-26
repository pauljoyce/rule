package com.clinical.dao.master;
import com.clinical.model.master.TEM_PAT_MASTER_INDEX;
import java.util.List;
import java.util.Map;

public interface ZjTemPatMasterIndexMapper {
    List<TEM_PAT_MASTER_INDEX>  findZjTemPatMasterIndexByUniqueId(Map map);

    List<TEM_PAT_MASTER_INDEX>  findOneZjTemPatMasterIndexByUniqueId(String unique_id_lv1);

    List<String> findZjTemPatMasterIndexByIncr();

    Integer countAllPerson();

    List<String> findAllUniqueidEveryDayIncr();

}