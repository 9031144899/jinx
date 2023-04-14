package com.legends.jinx.service.impl;

import com.legends.jinx.service.DrugInfoService;
import com.legends.jinx.dao.DrugInfoDao;
import com.legends.jinx.dto.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class DrugInfoServiceImpl implements DrugInfoService {

    @Autowired
    DrugInfoDao dao;

    @Override
    public List<DrugInfo> getDrugList(Map<String, Objects> paramsMap) {
        return dao.getDrugListFap(paramsMap);
//        return dao.getDrugList(paramsMap);
    }
}
