package com.digitalinnovatio.experts.productcatalog.repository;

import com.digitalinnovatio.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
