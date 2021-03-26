package com.clinical.service.impl;
import com.clinical.dao.cluster.HistologyReportMapper;
import com.clinical.model.cluster.HistologyReport;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HistologyReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistologyReportServiceImpl implements HistologyReportService {

    @Autowired
    HistologyReportMapper    histologyReportMapper;



    @Override
    public  void saveHistologyReport(HistologyReport histologyReport) {
         histologyReportMapper.saveHistologyReport(histologyReport);

     }

    @Override
    public  void deleteHistologyReport(List<String> uniqueId) {
         histologyReportMapper.deleteHistologyReport(uniqueId);

     }
}