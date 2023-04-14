package com.legends.jinx.params.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Schema(description = "获取医院信息入参")
public class ReqGetHosInfo {

    @Schema(description = "医院编码", required = true)
    private String hosId;

}
