package com.legends.jinx.service;

import com.legends.jinx.dto.DrugInfo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DrugInfoService {

    List<DrugInfo> getDrugList(Map<String, Objects> paramsMap);

}
