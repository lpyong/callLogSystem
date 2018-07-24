package cn.lipy.ssm.service;

import cn.lipy.ssm.domain.CallLog;

import java.util.List;

/**
 * Created by lipyong on 2018/7/16.
 */

public interface CallLogService {


    public List<CallLog> findAll();


}
