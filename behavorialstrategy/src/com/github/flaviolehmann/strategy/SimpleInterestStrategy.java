package com.github.flaviolehmann.strategy;

public class SimpleInterestStrategy implements InterestStrategy {

    @Override
    public Double getAmount(Long capital, Double interest, Long time) {
        return capital * (1 + interest * time);
    }
}
