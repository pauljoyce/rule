package com.clinical.service.impl;
import com.clinical.dao.cluster.BeforeTreatmentMapper;
import com.clinical.dao.cluster.DrugOrderMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjDrugOrderMapper;
import com.clinical.dao.master.ZjInpOrdersMapper;
import com.clinical.dao.master.ZjTemOperationRecordMapper;
import com.clinical.model.cluster.BeforeTreatment;
import com.clinical.model.cluster.DrugOrder;
import com.clinical.model.master.DRUG_ORDER;
import com.clinical.model.master.INP_ORDERS;
import com.clinical.model.master.TEM_OPERATION_RECORD;
import com.clinical.service.TemOperationRecordService;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.BeforeTreatmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeforeTreatmentServiceImpl implements BeforeTreatmentService {

    @Autowired
    BeforeTreatmentMapper    beforeTreatmentMapper;
    @Autowired
    DrugOrderMapper drugOrderMapper;
    @Autowired
    ZjDrugOrderMapper  zjdrugOrderMapper;
    @Autowired
    ZjTemOperationRecordMapper   zjTemOperationRecordMapper;
    @Autowired
    ZjInpOrdersMapper   zjInpOrdersMapper;
    @Autowired
    StandardResultMapper standardResultMapper;

    @Override
    public  void saveBeforeTreatment(BeforeTreatment beforeTreatment) {
         beforeTreatmentMapper.saveBeforeTreatment(beforeTreatment);

     }

    @Override
    public void inBeforeTreatment() {
        List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL = zjTemOperationRecordMapper.findZjTemOperationRecordByALL();
        for (TEM_OPERATION_RECORD tem_operation_record:zjTemOperationRecordByALL) {
            BeforeTreatment beforeTreatment = new BeforeTreatment();
            beforeTreatment.setUniqueId(tem_operation_record.getUNIQUE_ID());
            beforeTreatment.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            beforeTreatment.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            beforeTreatment.setP900(tem_operation_record.getP900());
            beforeTreatment.setPatientId(tem_operation_record.getPATIENT_ID());
            beforeTreatment.setVisitId(tem_operation_record.getVISIT_ID());
            List<DRUG_ORDER> zjDrugOrderByUniqueId1 = zjdrugOrderMapper.findZjDrugOrderByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            System.out.println("遍历zjdrugOrderMapper");
            for (DRUG_ORDER drug_order:zjDrugOrderByUniqueId1) {
                boolean falg=true;
                boolean falg2=true;
                if (drug_order.getGENERIC_STD()==null||drug_order.getGENERIC_STD().equals("")){
                    falg=false;
                }
                if (drug_order.getINGREDIENT_STD()==null||drug_order.getGENERIC_STD().equals("")){
                    falg2=false;
                }
                if (tem_operation_record.getITEM_BEGIN_DATE()==null||tem_operation_record.getITEM_BEGIN_DATE().equals("")){
                    falg=false;
                    falg2=false;
                }
                if (drug_order.getENTER_DATE_TIME()==null||drug_order.getENTER_DATE_TIME().equals("")){
                    falg=false;
                    falg2=false;

                }
                if(falg) {
                    if (drug_order.getGENERIC_STD().contains("维生素K")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setVitaminK("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("乳果糖")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setLactulose("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("聚乙二醇（PEG）") ||
                            drug_order.getGENERIC_STD().contains("聚乙二醇电解质散剂") ||
                           drug_order.getGENERIC_STD().contains("复方聚乙二醇电解质散") ||
                            drug_order.getGENERIC_STD().contains("和爽") ||
                             drug_order.getGENERIC_STD().contains("福静清") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setPolyethyleneGlycol("是");
                        }
                    }

                    if (drug_order.getGENERIC_STD().contains("硫酸镁") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setMagnesiumSulphate("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("番泻叶") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setSennaLeaf("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("蓖麻油") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setCastorOil("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("甘露醇") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setMannitol("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("复方匹可硫酸钠") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setCompoundSodiumPicosulfate("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("磷酸钠盐") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setSodiumPhosphateSalt("是");
                        }
                    }
                }
                if(falg2) {
                    if ( drug_order.getINGREDIENT_STD().contains("维生素K")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setVitaminK("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("乳果糖")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setLactulose("是");
                        }
                    }
                    if (drug_order.getINGREDIENT_STD().contains("聚乙二醇（PEG）")
                            || drug_order.getINGREDIENT_STD().contains("聚乙二醇电解质散剂")
                             || drug_order.getINGREDIENT_STD().contains("复方聚乙二醇电解质散")
                            || drug_order.getINGREDIENT_STD().contains("和爽")
                           || drug_order.getINGREDIENT_STD().contains("福静清")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setPolyethyleneGlycol("是");
                        }
                    }

                    if ( drug_order.getINGREDIENT_STD().contains("硫酸镁")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setMagnesiumSulphate("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("番泻叶")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setSennaLeaf("是");
                        }
                    }
                    if (drug_order.getINGREDIENT_STD().contains("蓖麻油")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setCastorOil("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("甘露醇")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setMannitol("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("复方匹可硫酸钠")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setCompoundSodiumPicosulfate("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("磷酸钠盐")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            beforeTreatment.setSodiumPhosphateSalt("是");
                        }
                    }
                }
            }
            if(beforeTreatment.getVitaminK()==null||beforeTreatment.getVitaminK().equals("")){
                beforeTreatment.setVitaminK("否");
            }
            if(beforeTreatment.getLactulose()==null||beforeTreatment.getLactulose().equals("")){
                beforeTreatment.setLactulose("否");
            }
            if(beforeTreatment.getPolyethyleneGlycol()==null||beforeTreatment.getPolyethyleneGlycol().equals("")){
                beforeTreatment.setPolyethyleneGlycol("否");
            }
            if(beforeTreatment.getMagnesiumSulphate()==null||beforeTreatment.getMagnesiumSulphate().equals("")){
                beforeTreatment.setMagnesiumSulphate("否");
            }

            if(beforeTreatment.getSennaLeaf()==null||beforeTreatment.getSennaLeaf().equals("")){
                beforeTreatment.setSennaLeaf("否");
            }
            if(beforeTreatment.getCastorOil()==null||beforeTreatment.getCastorOil().equals("")){
                beforeTreatment.setCastorOil("否");
            }
            if(beforeTreatment.getCompoundSodiumPicosulfate()==null||beforeTreatment.getCompoundSodiumPicosulfate().equals("")){
                beforeTreatment.setCompoundSodiumPicosulfate("否");
            }
            if(beforeTreatment.getMannitol()==null||beforeTreatment.getMannitol().equals("")){
                beforeTreatment.setMannitol("否");
            }
            if(beforeTreatment.getSodiumPhosphateSalt()==null||beforeTreatment.getSodiumPhosphateSalt().equals("")){
                beforeTreatment.setSodiumPhosphateSalt("否");
            }
            System.out.println("遍历zjInpOrdersByUniqueId");
            List<INP_ORDERS> zjInpOrdersByUniqueId = zjInpOrdersMapper.findZjInpOrdersByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            for (INP_ORDERS inp_orders:zjInpOrdersByUniqueId) {
                boolean falg=true;
                boolean falg2=true;
                if (inp_orders.getORDER_CLASS()==null||inp_orders.getORDER_CLASS().equals("")){
                    falg=false;
                }
                if (inp_orders.getORDER_TEXT()==null||inp_orders.getORDER_TEXT().equals("")){
                    falg2=false;
                }
                if (tem_operation_record.getITEM_BEGIN_DATE()==null||tem_operation_record.getITEM_BEGIN_DATE().equals("")){
                    falg=false;
                    falg2=false;

                }
                if (inp_orders.getENTER_DATE_TIME()==null||inp_orders.getENTER_DATE_TIME().equals("")){
                    falg=false;
                    falg2=false;
                }
                if(falg) {
                if (inp_orders.getORDER_CLASS().contains("维生素K")){
                    if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(inp_orders.getENTER_DATE_TIME())== 1){
                        beforeTreatment.setCleaningEnema("是");
                    }
                }
                }
                if(falg2) {
                    if (inp_orders.getORDER_TEXT().contains("维生素K")){
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(inp_orders.getENTER_DATE_TIME())== 1){
                            beforeTreatment.setCleaningEnema("是");
                        }
                    }
                }
            }
                if(beforeTreatment.getCleaningEnema()==null||beforeTreatment.getCleaningEnema().equals("")){
                    beforeTreatment.setCleaningEnema("否");
                }

                // beforeTreatment.setVitaminK();
            /*beforeTreatment.setLactulose();
            beforeTreatment.setPolyethyleneGlycol();
            beforeTreatment.setMagnesiumSulphate();
            beforeTreatment.setSodiumPhosphate();
            beforeTreatment.setSennaLeaf();
            beforeTreatment.setCastorOil();
            beforeTreatment.setCompoundSodiumPicosulfate();
            beforeTreatment.setMannitol();
            beforeTreatment.setSodiumPhosphateSalt();
            beforeTreatment.setCleaningEnema();*/
            beforeTreatment.setDataVersion(tem_operation_record.getDATA_VERSION());
            beforeTreatment.setDataDbSource(tem_operation_record.getDATA_DB_SOURCE());
            beforeTreatment.setDataTableSource(tem_operation_record.getDATA_TABLE_SOURCE());
            beforeTreatment.setDataFieldSource(tem_operation_record.getDATA_FIELD_SOURCE());
            beforeTreatment.setCreatedAt(tem_operation_record.getCREATED_AT());
            beforeTreatment.setCreator(tem_operation_record.getCREATOR());
            beforeTreatment.setUpdatedAt(tem_operation_record.getUPDATED_AT());
            beforeTreatmentMapper.saveBeforeTreatment(beforeTreatment);

        }

    }
}