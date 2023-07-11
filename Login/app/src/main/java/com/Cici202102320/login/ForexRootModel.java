package com.Cici202102320.login;

import com.google.gson.annotations.SerializedName;

public class ForexRootModel {
    @SerializedName("rates")
    private ForexRatesModel ForexRatesModel;

    public ForexRootModel() {}

    public com.Cici202102320.login.ForexRatesModel getForexRatesModel() {
        return ForexRatesModel;
    }

    public void setForexRatesModel(com.Cici202102320.login.ForexRatesModel forexRatesModel) {
        ForexRatesModel = forexRatesModel;
    }
}
