package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.DrugOrder;
public interface DrugOrderMapper {
    List<DrugOrder>  findDrugOrder(String uniqueId);
    void   saveDrugOrder(DrugOrder drugOrder);
    void   updateDrugOrder(DrugOrder drugOrder);

}