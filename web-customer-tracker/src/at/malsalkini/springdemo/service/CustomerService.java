package at.malsalkini.springdemo.service;

import at.malsalkini.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  19.06.2019
 * Time:  2:46 PM
 */
public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer (Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);

    public List<Customer> searchCustomers(String theSearchName);
}
