package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ProcedureRecord;
public interface ProcedureRecordMapper {
    List<ProcedureRecord>  findProcedureRecord(String uniqueId);
    void   saveProcedureRecord(ProcedureRecord procedureRecord);
    void   updateProcedureRecord(ProcedureRecord procedureRecord);

}