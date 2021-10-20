package br.com.geovanerodrigues.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.geovanerodrigues.Model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
