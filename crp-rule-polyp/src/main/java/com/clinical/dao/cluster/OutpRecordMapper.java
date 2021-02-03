package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OutpRecord;
public interface OutpRecordMapper {
    List<OutpRecord>  findOutpRecord(String uniqueId);
    void   saveOutpRecord(OutpRecord outpRecord);
    void   updateOutpRecord(OutpRecord outpRecord);

}