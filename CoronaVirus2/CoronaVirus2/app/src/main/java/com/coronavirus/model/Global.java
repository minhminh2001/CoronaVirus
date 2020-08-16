package com.coronavirus.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Global {
    @SerializedName("NewConfirmed")
    @Expose
    private long newConfirmed;
    @SerializedName("TotalConfirmed")
    @Expose
    private long totalConfirmed;
    @SerializedName("NewDeaths")
    @Expose
    private long newDeaths;
    @SerializedName("TotalDeaths")
    @Expose
    private long totalDeaths;
    @SerializedName("NewRecovered")
    @Expose
    private long newRecovered;
    @SerializedName("TotalRecovered")
    @Expose
    private long totalRecovered;


    public Global(long newConfirmed, long totalConfirmed, long newDeaths, long totalDeaths, long newRecovered, long totalRecovered) {
        this.newConfirmed = newConfirmed;
        this.totalConfirmed = totalConfirmed;
        this.newDeaths = newDeaths;
        this.totalDeaths = totalDeaths;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
    }

    public long getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(long newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public long getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(long newDeaths) {
        this.newDeaths = newDeaths;
    }

    public long getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(long totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public long getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(long newRecovered) {
        this.newRecovered = newRecovered;
    }

    public long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }
}
