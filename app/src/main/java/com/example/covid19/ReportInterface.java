package com.example.covid19;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ReportInterface {
    String BASEURL="https://disease.sh/v3/covid-19/";
    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    @GET("countries")
    Call<List<ReportClass>> getReport();
}
