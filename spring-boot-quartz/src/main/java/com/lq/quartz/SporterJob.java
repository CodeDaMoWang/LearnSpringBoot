package com.lq.quartz;

import com.lq.service.WalksService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by lq on 2018/10/10.
 * 自定义的Job任务类
 */
@Component
public class SporterJob {

    @Resource
    private WalksService walksService;

    @Scheduled(cron = "0 19 16 * * ? ")
    public void updateTodayWalks() throws Exception {
        walksService.updateWalks();
    }

}
