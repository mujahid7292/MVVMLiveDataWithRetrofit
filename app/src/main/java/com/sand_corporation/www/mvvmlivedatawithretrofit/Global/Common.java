package com.sand_corporation.www.mvvmlivedatawithretrofit.Global;

import com.sand_corporation.www.mvvmlivedatawithretrofit.Remote.APIService;
import com.sand_corporation.www.mvvmlivedatawithretrofit.Remote.RetrofitClient;

public class Common {

    public static final String BASE_URL = "http://192.168.99.104:3000/api/";

    public static APIService getAPIService(){
        return RetrofitClient.getRetrofit(BASE_URL).create(APIService.class);
    }
}
