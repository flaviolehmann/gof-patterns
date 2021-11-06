package com.github.flaviolehmann.strategy;

public interface InterestStrategy {

    Double getAmount(Long capital, Double interest, Long time);
}
