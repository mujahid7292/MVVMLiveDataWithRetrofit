package com.sand_corporation.www.mvvmlivedatawithretrofit.Repository;

import android.app.Application;

import com.sand_corporation.www.mvvmlivedatawithretrofit.Global.Common;
import com.sand_corporation.www.mvvmlivedatawithretrofit.Model.Ticket;
import com.sand_corporation.www.mvvmlivedatawithretrofit.Remote.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private Application application;
    private APIService apiService;

    public Repository() {
        apiService = Common.getAPIService();
    }

    public Ticket getTicketFromRemote(){
        final Ticket ticket = new Ticket();
        Call<Ticket> returnedTicket = apiService.getTicket();
        returnedTicket.enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                if (response != null){
                    Ticket tik = response.body();
                    ticket.setTicketID(tik.getTicketID());
                    ticket.setTicketName(tik.getTicketName());
                    ticket.setTicketDescription(tik.getTicketDescription());
                }
            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });

        return ticket;
    }
}
