package com.customerapp.cms.service;
import com.customerapp.cms.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    //add customer

    public Customer addCustomer(Customer customer){
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;
    }
    //get all customers
    public List<Customer> getCustomers(){
        return customerList;
    }

    //get a particular customer
    public Customer getCustomer(int customerId){
        return customerList.stream().filter(c -> c.getCustomerId()==customerId).findFirst().get();
    }
    //update existing customer
    public Customer updateCustomer(int customerId, Customer customer){
        customerList.stream().forEach(c->{
            if(c.getCustomerId()==customerId){
                c.setCusotmerFirstName(customer.getCusotmerFirstName());
                c.setCustomerLastName(customer.getCustomerLastName());
                c.setCustomerEmail(customer.getCustomerEmail());

            }
        });

        return customerList.stream().filter(c -> c.getCustomerId()==customerId).findFirst().get();
    }
    //delete a customer
    public void deleteCustomer(int customerId){
        customerList.stream().forEach(c -> {
            if(c.getCustomerId()==customerId){
                customerList.remove(c);
            }
        });
    }



}
