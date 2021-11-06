package com.github.flaviolehmann;

import com.github.flaviolehmann.strategy.CompoundInterestStrategy;
import com.github.flaviolehmann.strategy.InterestStrategy;
import com.github.flaviolehmann.strategy.SimpleInterestStrategy;

import java.text.NumberFormat;

public class Main {

    private static InterestStrategy interestStrategy;

    public static void main(String ...args) {
        Long capital = 1000L;
        Double interestPerMonth = 0.008;
        Long months = 12L;

        changeStrategyToSimpleInterests();
        System.out.println("Amount using simple interest strategy: " + getAmount(capital, interestPerMonth, months));

        changeStrategyToCompoundInterests();
        System.out.println("Amount using compound interest strategy: " + getAmount(capital, interestPerMonth, months));
    }

    private static String getAmount(Long capital, Double interestPerMonth, Long months) {
        return NumberFormat.getCurrencyInstance().format(interestStrategy.getAmount(capital, interestPerMonth, months));
    }

    private static void changeStrategyToSimpleInterests() {
        interestStrategy = new SimpleInterestStrategy();
    }

    private static void changeStrategyToCompoundInterests() {
        interestStrategy = new CompoundInterestStrategy();
    }
}
