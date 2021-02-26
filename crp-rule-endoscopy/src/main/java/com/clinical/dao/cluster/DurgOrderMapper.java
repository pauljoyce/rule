package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.DurgOrder;
public interface DurgOrderMapper {
    List<DurgOrder>  findDurgOrder(String uniqueId);
    void   saveDurgOrder(DurgOrder durgOrder);
    void   updateDurgOrder(DurgOrder durgOrder);

}