package com.legends.jinx.params.req;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Schema(name = "医院药品信息入参名称", description = "获取医院药品信息入参")
public class ReqGetDrugInfo {

    //    @Schema(description = "医院编码", name = "名称222", required = true)
    @Parameter(description = "医院编码", name = "名称222", required = true)
    private String hosId;

    @Schema(description = "药品编码", name = "名称333", required = true)
    private String drugId;

}
