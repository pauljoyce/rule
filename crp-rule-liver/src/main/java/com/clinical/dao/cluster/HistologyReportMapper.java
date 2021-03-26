package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HistologyReport;
public interface HistologyReportMapper {
    List<HistologyReport>  findHistologyReportByUniqueId(String uniqueId);
    void   saveHistologyReport(HistologyReport histologyReport);
    void   updateHistologyReport(HistologyReport histologyReport);
    void   deleteHistologyReport(List<String> unique_id);

}