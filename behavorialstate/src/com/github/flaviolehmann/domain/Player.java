package com.github.flaviolehmann.domain;

import com.github.flaviolehmann.service.state.FullLifeState;
import com.github.flaviolehmann.service.state.LowLifeState;
import com.github.flaviolehmann.service.state.NormalLifeState;
import com.github.flaviolehmann.service.context.PlayerState;

public class Player {

    private final String name;
    private Long life;
    private PlayerState state;

    public Player(String name) {
        this.name = name;
        life = 0L;
    }

    public String getName() {
        return name;
    }

    public Long getLife() {
        return life;
    }

    public void setLife(Long life) {
        this.life = life;
        updateStatus(life);
    }

    private void updateStatus(Long life) {
        if (life >= 100) {
            state = new FullLifeState(this);
            return;
        }
        if (life >= 30) {
            state = new NormalLifeState(this);
            return;
        }
        state = new LowLifeState(this);
    }

    public void logStatus() {
        state.logStatus();
    }
}
