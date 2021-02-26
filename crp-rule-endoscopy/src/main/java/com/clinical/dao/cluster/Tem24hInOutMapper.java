package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Tem24hInOut;
public interface Tem24hInOutMapper {
    List<Tem24hInOut>  findTem24hInOut(String uniqueId);
    void   saveTem24hInOut(Tem24hInOut tem24hInOut);
    void   updateTem24hInOut(Tem24hInOut tem24hInOut);

}