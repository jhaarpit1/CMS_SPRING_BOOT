package com.customerapp.cms.service;
import com.customerapp.cms.dao.CustomerDAO;
import com.customerapp.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    //add customer

    public Customer addCustomer(Customer customer){
        return customerDAO.save(customer);
    }
    //get all customers
    public List<Customer> getCustomers(){
        return customerDAO.findAll();
    }

    //get a particular customer
    public Customer getCustomer(int customerId){
        return customerDAO.findById(customerId).get();
    }
    //update existing customer
    public Customer updateCustomer(int customerId, Customer customer){
        customer.setCustomerId(customerId);
        return  customerDAO.save(customer);
    }
    //delete a customer
    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
    }



}
