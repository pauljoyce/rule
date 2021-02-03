package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ThyroidPuncture;
public interface ThyroidPunctureMapper {
    List<ThyroidPuncture>  findThyroidPuncture(String uniqueId);
    void   saveThyroidPuncture(ThyroidPuncture thyroidPuncture);
    void   updateThyroidPuncture(ThyroidPuncture thyroidPuncture);

}