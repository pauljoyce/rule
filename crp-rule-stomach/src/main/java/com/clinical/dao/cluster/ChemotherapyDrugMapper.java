package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ChemotherapyDrug;
public interface ChemotherapyDrugMapper {
    List<ChemotherapyDrug>  findChemotherapyDrug(String uniqueId);
    void   saveChemotherapyDrug(ChemotherapyDrug chemotherapyDrug);
    void   updateChemotherapyDrug(ChemotherapyDrug chemotherapyDrug);

}