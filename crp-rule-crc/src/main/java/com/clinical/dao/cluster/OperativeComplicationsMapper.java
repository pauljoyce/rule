package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OperativeComplications;
public interface OperativeComplicationsMapper {
    List<OperativeComplications>  findOperativeComplications(String uniqueId);
    void   saveOperativeComplications(OperativeComplications operativeComplications);
    void   updateOperativeComplications(OperativeComplications operativeComplications);

}