package com.revalu.repository;

import com.revalu.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    // To find product using category name
    List<Product> findByCategoriesName(String name);

    // To find product with tags given
    List<Product> findByTagsContaining(String tag);
}
