package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Marker;
public interface MarkerMapper {
    List<Marker>  findMarkerByUniqueId(String uniqueId);
    void   saveMarker(Marker marker);
    void   updateMarker(Marker marker);
    void   deleteMarker(String unique_id);

}