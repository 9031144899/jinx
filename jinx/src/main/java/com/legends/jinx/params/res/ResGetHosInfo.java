package com.legends.jinx.params.res;

import com.legends.jinx.dto.DrugInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "获取医院信息出参")
public class ResGetHosInfo {

    @Schema(description = "医院编码")
    private String hosId;

    @Schema(description = "药品编码")
    private String hosName;

    @Schema(description = "药品信息列表")
    private List<DrugInfo> drugInfoList;

}
