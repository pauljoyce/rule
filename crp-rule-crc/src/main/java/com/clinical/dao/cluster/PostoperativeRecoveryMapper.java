package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PostoperativeRecovery;
public interface PostoperativeRecoveryMapper {
    List<PostoperativeRecovery>  findPostoperativeRecovery(String uniqueId);
    void   savePostoperativeRecovery(PostoperativeRecovery postoperativeRecovery);
    void   updatePostoperativeRecovery(PostoperativeRecovery postoperativeRecovery);

}