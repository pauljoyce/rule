package com.clinical.dao.master;

import java.util.List;

/**
 * @Author: mengchao
 * @Date: 2021/2/2 17:54
 */
public interface StandardResultMapper {
    List<String> selectStandardResultListById(String standardTableId);

    String selectStandardResultById(String standardTableId);
}
