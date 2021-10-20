package br.com.geovanerodrigues.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.geovanerodrigues.Model.Customer;
import br.com.geovanerodrigues.Service.CustomerService;

@RestController
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Customer> findAll() {
		return customerService.findAll();


}
	@DeleteMapping("{id}")
	public void remove(@PathVariable int CPF) {
		customerService.remove(CPF);

}
	@GetMapping("/{id}")
	public Optional<Customer> findOne(@PathVariable int id) {
		return customerService.findOne(id);
	}
	@PostMapping
	public Map<String, String> insert(Customer customer){
		Customer isSuccess = customerService.insert(customer);
		Map<String,String> result = new HashMap<String,String>();
		if(isSuccess!= null) {
			result.put("result", "Pessoa cadastrada com sucesso!!!");
		}else {
			result.put("result", "Não foi possível cadastrar a pessoa!!!");
		}
		return result;
	
	}
	
	

}
