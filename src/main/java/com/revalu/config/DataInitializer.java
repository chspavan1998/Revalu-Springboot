package com.revalu.config;

import com.revalu.model.Category;
import com.revalu.model.Product;
import com.revalu.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.Collections;

@Configuration
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        productRepository.deleteAll();

        // Paint
        Product paint = new Product(
            "0d835b0d-4d4e-46cc-88e1-5169f638f6dc",
            "Paint",
            Arrays.asList(new Category(1, "Coverings"), new Category(3, "End product")),
            Collections.singletonList("new-product")
        );

        // Mortar 
        Product mortar = new Product(
            "57f318aa-75ee-4b4b-a7c0-e17400b91897",
            "Mortar",
            Arrays.asList(new Category(2, "Building products"), new Category(3, "End product")),
            null
        );

        // Expanded cork
        Product expandedCork = new Product(
            "75ee-4baa-0d835bb-a7c0-e174005169f7",
            "Expanded cork",
            Arrays.asList(new Category(4, "Insulation"), new Category(2, "Building products")),
            Collections.singletonList("bio-based")
        );

        productRepository.save(paint);
        productRepository.save(mortar);
        productRepository.save(expandedCork);

        System.out.println("Inserted Sample data into epd_data");
    }
}
