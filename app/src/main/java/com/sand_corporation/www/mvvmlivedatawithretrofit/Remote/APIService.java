package com.sand_corporation.www.mvvmlivedatawithretrofit.Remote;

import com.sand_corporation.www.mvvmlivedatawithretrofit.Model.Ticket;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("ticket")
    Call<Ticket> getTicket();
}
