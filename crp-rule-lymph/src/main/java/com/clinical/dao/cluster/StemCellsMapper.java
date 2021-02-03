package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.StemCells;
public interface StemCellsMapper {
    List<StemCells>  findStemCells(String uniqueId);
    void   saveStemCells(StemCells stemCells);
    void   updateStemCells(StemCells stemCells);

}