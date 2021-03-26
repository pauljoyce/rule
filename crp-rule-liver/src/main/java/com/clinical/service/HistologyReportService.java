package com.clinical.service;
import com.clinical.model.cluster.HistologyReport;

import java.util.List;


public interface HistologyReportService {



    public  void saveHistologyReport(HistologyReport histologyReport);

    public  void deleteHistologyReport(List<String> uniqueId);

}