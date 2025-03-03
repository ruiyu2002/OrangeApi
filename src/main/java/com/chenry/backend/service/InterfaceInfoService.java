package com.chenry.OrangeApi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenry.OrangeApi.model.entity.InterfaceInfo;

/**
* @author 18786
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-10-20 22:07:14
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
