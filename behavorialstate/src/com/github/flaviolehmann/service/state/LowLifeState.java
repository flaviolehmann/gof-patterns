package com.github.flaviolehmann.service.state;

import com.github.flaviolehmann.domain.Player;
import com.github.flaviolehmann.service.context.PlayerState;

public class LowLifeState implements PlayerState {

    private Player player;

    public LowLifeState(Player player) {
        this.player = player;
    }

    @Override
    public void logStatus() {
        System.out.printf("%s's life is extremely low.\n", player.getName());
    }
}
