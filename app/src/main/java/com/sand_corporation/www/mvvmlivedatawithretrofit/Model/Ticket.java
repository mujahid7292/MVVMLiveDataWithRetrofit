package com.sand_corporation.www.mvvmlivedatawithretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("Ticket_ID")
    @Expose()
    private String ticketID;

    @SerializedName("Ticket_Name")
    @Expose()
    private String ticketName;

    @SerializedName("Ticket_Description")
    @Expose()
    private String ticketDescription;

    public Ticket() {

    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }
}
