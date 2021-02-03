package com.clinical.service.impl;
import com.clinical.dao.cluster.LayerCellDetectionMapper;
import com.clinical.model.cluster.LayerCellDetection;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.LayerCellDetectionService;
import org.springframework.stereotype.Service;

@Service
public class LayerCellDetectionServiceImpl implements LayerCellDetectionService {

    @Autowired
    LayerCellDetectionMapper    layerCellDetectionMapper;



    @Override
    public  void saveLayerCellDetection(LayerCellDetection layerCellDetection) {
         layerCellDetectionMapper.saveLayerCellDetection(layerCellDetection);

     }
}