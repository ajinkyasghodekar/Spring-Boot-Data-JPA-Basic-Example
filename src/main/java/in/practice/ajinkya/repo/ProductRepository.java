package in.practice.ajinkya.repo;

import org.springframework.data.repository.CrudRepository;

import in.practice.ajinkya.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
