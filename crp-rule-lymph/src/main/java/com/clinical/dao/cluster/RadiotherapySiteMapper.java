package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.RadiotherapySite;
public interface RadiotherapySiteMapper {
    List<RadiotherapySite>  findRadiotherapySite(String uniqueId);
    void   saveRadiotherapySite(RadiotherapySite radiotherapySite);
    void   updateRadiotherapySite(RadiotherapySite radiotherapySite);

}