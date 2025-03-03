package com.chenry.OrangeApi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenry.OrangeApi.common.ErrorCode;
import com.chenry.OrangeApi.exception.BusinessException;
import com.chenry.OrangeApi.mapper.InterfaceInfoMapper;
import com.chenry.OrangeApi.model.entity.InterfaceInfo;
import com.chenry.OrangeApi.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 18786
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-10-20 22:07:14
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




