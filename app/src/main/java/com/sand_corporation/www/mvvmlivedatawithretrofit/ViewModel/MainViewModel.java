package com.sand_corporation.www.mvvmlivedatawithretrofit.ViewModel;

import android.arch.lifecycle.ViewModel;

import com.sand_corporation.www.mvvmlivedatawithretrofit.Model.Ticket;
import com.sand_corporation.www.mvvmlivedatawithretrofit.Repository.Repository;

public class MainViewModel extends ViewModel {

    private Ticket ticket;
    private Repository mRepository;

    public MainViewModel() {
        mRepository = new Repository();
    }


    public Ticket getTicketFromRepository(){
        if (ticket == null){
            ticket = mRepository.getTicketFromRemote();
        }
       return ticket;
    }
}
