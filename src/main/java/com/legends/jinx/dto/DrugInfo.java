package com.legends.jinx.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DrugInfo {

    @Schema(description = "药品编码")
    private String goodsId;

    @Schema(description = "药品名称")
    private String drugName;

    @Schema(description = "医院编码")
    private String hosId;

    @Schema(description = "医院名称")
    private String hosName;
}
