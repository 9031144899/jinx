package com.legends.jinx.dao;


import com.legends.jinx.dto.DrugInfo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DrugInfoDao {

    List<DrugInfo> getDrugList(Map<String, Objects> paramsMap);

    List<DrugInfo> getDrugListFap(Map<String, Objects> paramsMap);

}
