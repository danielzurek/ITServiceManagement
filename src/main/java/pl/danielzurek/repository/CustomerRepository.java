package pl.danielzurek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielzurek.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
