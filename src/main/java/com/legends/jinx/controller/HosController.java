package com.legends.jinx.controller;

import com.legends.jinx.dto.DrugInfo;
import com.legends.jinx.params.req.ReqGetHosInfo;
import com.legends.jinx.params.res.ResGetHosInfo;
import com.legends.jinx.service.DrugInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/hos")
@Tag(name = "医院信息接口")
@Slf4j
public class HosController {

    @Autowired
    private DrugInfoService drugInfoService;


    @PostMapping("getHosInfoById")
    @Operation(summary = "按医院编码获取医院信息")
    public ResGetHosInfo getHosInfoById(@RequestBody ReqGetHosInfo hosInfoReq) {
        log.info("按医院编码获取医院信息接口入参：" + hosInfoReq);
        ResGetHosInfo hosInfoRes = new ResGetHosInfo();
        Map<String, Objects> paramsMap = new HashMap<>(16);
        List<DrugInfo> list = drugInfoService.getDrugList(paramsMap);
        hosInfoRes.setHosName("测试医院名称");
        return hosInfoRes;
    }

    @PostMapping("getHosInfoList")
    @Operation(description = "获取医院信息列表", summary = "第三个方法")
    public ResGetHosInfo getHosInfoList(@RequestBody ReqGetHosInfo hosInfoReq) {
        log.info("获取医院信息列表接口入参：" + hosInfoReq);
        ResGetHosInfo hosInfoRes = new ResGetHosInfo();
        hosInfoRes.setHosName("测试医院名称3333");
        return hosInfoRes;
    }

}
