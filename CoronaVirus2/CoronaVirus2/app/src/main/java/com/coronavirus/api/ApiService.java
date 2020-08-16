package com.coronavirus.api;

import com.coronavirus.model.Countries;
import com.coronavirus.model.Global;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/summary")
    Observable<Global> getAllInfoGlobal();

    @GET("/summary")
    Observable<Countries> getListAllInfoCountries();

    @GET("/countries")
    Observable<Countries> getListCountriesName();
}
