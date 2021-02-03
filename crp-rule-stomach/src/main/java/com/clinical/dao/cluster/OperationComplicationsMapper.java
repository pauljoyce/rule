package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OperationComplications;
public interface OperationComplicationsMapper {
    List<OperationComplications>  findOperationComplicationsByUniqueId(String uniqueId);
    void   saveOperationComplications(OperationComplications operationComplications);
    void   updateOperationComplications(OperationComplications operationComplications);
    void   deleteOperationComplications(String unique_id);

}