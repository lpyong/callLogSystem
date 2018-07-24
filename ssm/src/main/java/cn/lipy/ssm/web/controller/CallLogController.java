package cn.lipy.ssm.web.controller;

import cn.lipy.ssm.domain.CallLog;
import cn.lipy.ssm.service.CallLogService;
import cn.lipy.ssm.util.CallLogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by lipyong on 2018/7/16.
 */
@Controller
public class CallLogController {

    @Resource(name ="callLogService")
    private CallLogService cs ;

    @RequestMapping("/callLog/findAll")
    public String findAll(Model m){
        List<CallLog> list = cs.findAll();
        m.addAttribute("callLogs",list);
        System.out.println();
        return "callLog/callLogList" ;
    }

    @RequestMapping("/callLog/toFindCallLogPage")
    public String toFindCallLogPage(){
        return "callLog/findCallLog" ;
    }


    @RequestMapping(value = "/callLog/findCallLog",method = RequestMethod.POST)
    public String findCallLog(Model m , @RequestParam("caller") String caller, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        List<CallLogRange> list = CallLogUtil.getCallLogRanges(startTime, endTime);
        List<CallLog> logs = cs.findCallogs(caller,list);
        m.addAttribute("callLogs", logs);
        System.out.println(caller);
        System.out.println(startTime);
        System.out.println(endTime);
        return "callLog/callLogList" ;
    }


}


