package com.chenry.OrangeApi.model.vo;

import com.chenry.OrangeApi.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {
    /**
     * 调用次数
     */
    private Integer totalNum;

    public static final long serialVersionUID = 1L;
}
