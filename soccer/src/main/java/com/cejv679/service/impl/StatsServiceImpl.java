package com.cejv679.service.impl;

import com.cejv679.beans.Player;
import com.cejv679.beans.Stats;
import com.cejv679.service.StatsService;
import org.springframework.stereotype.Component;

/**
 * Created by Carlos Molina on 2015-07-27.
 */
@Component
public class StatsServiceImpl implements StatsService{
    public StatsServiceImpl() {
    }

    public void updateStatistic(Player player, Stats stats){
        player.setStats(stats);
    }
}
