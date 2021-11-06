package com.github.flaviolehmann.strategy;

public class CompoundInterestStrategy implements InterestStrategy {

    @Override
    public Double getAmount(Long capital, Double interest, Long time) {
        return capital * Math.pow(1 + interest, time);
    }
}
