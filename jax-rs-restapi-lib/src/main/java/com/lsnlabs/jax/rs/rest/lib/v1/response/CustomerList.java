package com.lsnlabs.jax.rs.rest.lib.v1.response;

import com.lsnlabs.jax.rs.rest.lib.v1.Customer;

import java.util.List;

public class CustomerList {

    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}