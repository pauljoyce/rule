package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.LayerCellDetection;
public interface LayerCellDetectionMapper {
    List<LayerCellDetection>  findLayerCellDetection(String uniqueId);
    void   saveLayerCellDetection(LayerCellDetection layerCellDetection);
    void   updateLayerCellDetection(LayerCellDetection layerCellDetection);

}