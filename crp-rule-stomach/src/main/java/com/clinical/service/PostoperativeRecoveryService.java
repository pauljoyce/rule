package com.clinical.service;
import com.clinical.model.cluster.PostoperativeRecovery;


public interface PostoperativeRecoveryService {



    public  void savePostoperativeRecovery(PostoperativeRecovery postoperativeRecovery);

    public  void deletePostoperativeRecovery(String uniqueId);

}