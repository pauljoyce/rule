package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.FollowUp;
public interface FollowUpMapper {
    List<FollowUp>  findFollowUp(String uniqueId);
    void   saveFollowUp(FollowUp followUp);
    void   updateFollowUp(FollowUp followUp);

}