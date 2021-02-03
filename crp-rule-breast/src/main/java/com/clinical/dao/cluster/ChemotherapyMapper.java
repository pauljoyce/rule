package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Chemotherapy;
public interface ChemotherapyMapper {
    List<Chemotherapy>  findChemotherapy(String uniqueId);
    void   saveChemotherapy(Chemotherapy chemotherapy);
    void   updateChemotherapy(Chemotherapy chemotherapy);

}