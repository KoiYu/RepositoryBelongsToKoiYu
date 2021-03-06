package com.example.service.impl;

import com.example.pojo.Case;
import com.example.mapper.CaseMapper;
import com.example.service.ICaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试用例表 服务实现类
 * </p>
 *
 * @author yuliqiang
 * @since 2021-06-04
 */
@Service
public class CaseServiceImpl extends ServiceImpl<CaseMapper, Case> implements ICaseService {

}
