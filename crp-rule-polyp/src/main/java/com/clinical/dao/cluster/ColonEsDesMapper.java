package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ColonEsDes;
public interface ColonEsDesMapper {
    List<ColonEsDes>  findColonEsDes(String uniqueId);
    void   saveColonEsDes(ColonEsDes colonEsDes);
    void   updateColonEsDes(ColonEsDes colonEsDes);

}