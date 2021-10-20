package br.com.geovanerodrigues.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.geovanerodrigues.Model.Customer;
import br.com.geovanerodrigues.Repository.CustomerRepository;


@Service
public class CustomerService {
	 @Autowired
	    private CustomerRepository customerRepository;
	 
	 public Customer insert(Customer customer) {
	        return customerRepository.save(customer);
	    }
	 public Customer update(Customer objCustomer) {
	        return customerRepository.save(objCustomer);
	        }
	 public List<Customer> findAll() {
	        List<Customer> customers = new ArrayList<>();
	        customerRepository.findAll().forEach(customers::add);
	        return customers;
	        }
	 public Optional<Customer> findOne(int id) {
	        return customerRepository.findById(id);
	        }
	 public void remove(int id) {
	        customerRepository.deleteById(id);
	    }
	}