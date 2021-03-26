package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexPathologyIcd;
public interface IndexPathologyIcdMapper {
    List<IndexPathologyIcd>  findIndexPathologyIcdByUniqueId(String uniqueId);
    void   saveIndexPathologyIcd(IndexPathologyIcd indexPathologyIcd);
    void   updateIndexPathologyIcd(IndexPathologyIcd indexPathologyIcd);
    void   deleteIndexPathologyIcd(List<String> unique_id);

}