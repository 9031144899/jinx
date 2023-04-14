package com.legends.jinx.params.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "获取医院药品信息出参")
public class ResGetDrugInfo {

    @Schema(description = "医院编码", name = "名称222")
    private String hosId;

    @Schema(description = "药品编码", name = "名称333")
    private String hosName;

    @Schema(description = "药品编码", name = "名称444")
    private String drugId;

    @Schema(description = "药品名称", name = "名称555")
    private String drugName;

}
