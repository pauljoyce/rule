package com.clinical.service.impl;
import com.clinical.dao.cluster.TemCourseDisMapper;
import com.clinical.model.cluster.TemCourseDis;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemCourseDisService;
import org.springframework.stereotype.Service;

@Service
public class TemCourseDisServiceImpl implements TemCourseDisService {

    @Autowired
    TemCourseDisMapper    temCourseDisMapper;



    @Override
    public  void saveTemCourseDis(TemCourseDis temCourseDis) {
         temCourseDisMapper.saveTemCourseDis(temCourseDis);

     }
}