package com.vandan.paymentsApp.constants;

public enum DefaultLimitsConstants {
    TRANSACTION (1000), BALANCE(10000);

    private float value;
    DefaultLimitsConstants(int value) {
        this.value = value;
    }
    public float getValue() {
        return value;
    }
}
