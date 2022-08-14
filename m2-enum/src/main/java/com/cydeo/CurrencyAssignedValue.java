package com.cydeo;

public enum CurrencyAssignedValue {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int value;

    CurrencyAssignedValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


