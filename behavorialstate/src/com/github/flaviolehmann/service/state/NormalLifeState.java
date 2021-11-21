package com.github.flaviolehmann.service.state;

import com.github.flaviolehmann.domain.Player;
import com.github.flaviolehmann.service.context.PlayerState;

public class NormalLifeState implements PlayerState {

    private Player player;

    public NormalLifeState(Player player) {
        this.player = player;
    }

    @Override
    public void logStatus() {
        System.out.printf("%s's life is %d.\n", player.getName(), player.getLife());
    }
}
