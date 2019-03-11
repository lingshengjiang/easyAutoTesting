package com.hry.controller;

import com.hry.po.AutoRateStatistic;
import com.hry.po.RealtimeStatistic;
import com.hry.response.Result;
import com.hry.service.StatisticService;
import com.hry.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/9 14:39
 */
@RestController
@RequestMapping("/statistic")
public class StatisticController {
    @Autowired
    StatisticService statisticService;

    /*
     */

    /**
     * 实时统计
     *
     * @return
     *//*

    @GetMapping("/realtimeOld")
    public Result<List<RealtimeStatistic>> realtimeStatisticsOld() {
        return ResultUtil.success(statisticService.statisticCurrentOld());
    }
*/

    /**
     * 实时统计
     * @return
     */
    @GetMapping("/realtime")
    public Result<List<RealtimeStatistic>> realtimeStatistics() {
        return ResultUtil.success(statisticService.statisticCurrent());
    }

    /**
     * 自动化覆盖率统计
     * @return
     */
    @GetMapping("/autoRate")
    public Result<List<AutoRateStatistic>> autoRate() {
        return ResultUtil.success(statisticService.statisticCustomRate());
    }
}
