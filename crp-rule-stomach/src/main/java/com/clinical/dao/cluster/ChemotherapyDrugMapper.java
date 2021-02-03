package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChemotherapyDrug;
public interface ChemotherapyDrugMapper {
    List<ChemotherapyDrug>  findChemotherapyDrugByUniqueId(String uniqueId);
    void   saveChemotherapyDrug(ChemotherapyDrug chemotherapyDrug);
    void   updateChemotherapyDrug(ChemotherapyDrug chemotherapyDrug);
    void   deleteChemotherapyDrug(String unique_id);

}