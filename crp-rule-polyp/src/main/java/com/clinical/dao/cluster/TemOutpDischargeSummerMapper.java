package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemOutpDischargeSummer;
public interface TemOutpDischargeSummerMapper {
    List<TemOutpDischargeSummer>  findTemOutpDischargeSummer(String uniqueId);
    void   saveTemOutpDischargeSummer(TemOutpDischargeSummer temOutpDischargeSummer);
    void   updateTemOutpDischargeSummer(TemOutpDischargeSummer temOutpDischargeSummer);

}