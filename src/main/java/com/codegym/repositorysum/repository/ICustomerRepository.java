package com.codegym.repositorysum.repository;

import com.codegym.repositorysum.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
