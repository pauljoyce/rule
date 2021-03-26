package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Chemotherapy;
public interface ChemotherapyMapper {
    List<Chemotherapy>  findChemotherapyByUniqueId(String uniqueId);
    void   saveChemotherapy(Chemotherapy chemotherapy);
    void   updateChemotherapy(Chemotherapy chemotherapy);
    void   deleteChemotherapy(List<String> unique_id);

}