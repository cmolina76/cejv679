package com.cejv679.service;

import com.cejv679.beans.Player;
import com.cejv679.beans.Stats;

/**
 * Created by Carlos Molina on 2015-07-27.
 */
public interface StatsService {

    void updateStatistic(Player player,Stats stats);
}
