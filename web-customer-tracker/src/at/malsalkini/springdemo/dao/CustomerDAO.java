package at.malsalkini.springdemo.dao;

import at.malsalkini.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  19.06.2019
 * Time:  11:28 AM
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);

    public List<Customer> searchCustomers(String theSearchName);

}
