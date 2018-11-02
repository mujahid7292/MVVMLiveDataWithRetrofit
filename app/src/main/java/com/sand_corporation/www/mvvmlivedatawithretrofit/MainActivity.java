package com.sand_corporation.www.mvvmlivedatawithretrofit;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sand_corporation.www.mvvmlivedatawithretrofit.ViewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private TextView txtTicketID, txtTicketName, txtTicketDescription;
    private Button btnGetTicket;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTicketID = findViewById(R.id.txtTicketID);
        txtTicketName = findViewById(R.id.txtTicketName);
        txtTicketDescription = findViewById(R.id.txtTicketDescription);

        btnGetTicket = findViewById(R.id.btnGetTicket);
        btnGetTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTicketInTheView();
            }
        });

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getTicketFromRepository();

    }

    private void setTicketInTheView(){
        String strTicketID, strTicketName, strTicketDescription;
        strTicketID = mainViewModel.getTicketFromRepository().getTicketID().toString();
        strTicketName = mainViewModel.getTicketFromRepository().getTicketName().toString();
        strTicketDescription = mainViewModel.getTicketFromRepository().getTicketDescription().toString();

        txtTicketID.setText(strTicketID);
        txtTicketName.setText(strTicketName);
        txtTicketDescription.setText(strTicketDescription);
    }
}
