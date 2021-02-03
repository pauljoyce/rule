package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.CervicalSmearCytology;
public interface CervicalSmearCytologyMapper {
    List<CervicalSmearCytology>  findCervicalSmearCytology(String uniqueId);
    void   saveCervicalSmearCytology(CervicalSmearCytology cervicalSmearCytology);
    void   updateCervicalSmearCytology(CervicalSmearCytology cervicalSmearCytology);

}