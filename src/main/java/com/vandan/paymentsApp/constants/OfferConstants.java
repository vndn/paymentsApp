package com.vandan.paymentsApp.constants;

public enum OfferConstants {
    FLAT("flat"), PERCENT("percent"), SIGNUP("signup_discount");
    private String value;

    OfferConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

