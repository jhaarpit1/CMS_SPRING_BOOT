package com.customerapp.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    @JsonProperty("id")
    private int customerId;
    @JsonProperty("firstName")
    private String cusotmerFirstName;
    @JsonProperty("lastName")
    private String customerLastName;
    @JsonProperty("email")
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCusotmerFirstName() {
        return cusotmerFirstName;
    }

    public void setCusotmerFirstName(String cusotmerFirstName) {
        this.cusotmerFirstName = cusotmerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }



}
