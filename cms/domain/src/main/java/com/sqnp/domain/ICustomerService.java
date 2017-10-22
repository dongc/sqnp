package com.sqnp.domain;

import com.sqnp.entity.Customer;

import java.util.List;

/**
 * Created by dongc on 2017/6/18.
 */
public interface ICustomerService {
    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

    List<Customer> findAll();

    Customer save(Customer customer);
}
