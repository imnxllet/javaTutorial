package basics.class6.strategyPattern.impl;

import basics.class6.strategyPattern.Strategy;

public class AdditionStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}