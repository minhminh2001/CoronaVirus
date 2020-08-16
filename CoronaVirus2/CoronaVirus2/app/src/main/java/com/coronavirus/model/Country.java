package com.coronavirus.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("ISO2")
    @Expose
    private String iso2;

    public Country(String country, String iso2) {
        this.country = country;
        this.iso2 = iso2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }
}
