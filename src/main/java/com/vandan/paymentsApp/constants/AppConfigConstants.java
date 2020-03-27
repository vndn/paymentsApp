package com.vandan.paymentsApp.constants;

public enum AppConfigConstants {
    DB_NAME ("paymentsDB");

    private String value;
    AppConfigConstants(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
