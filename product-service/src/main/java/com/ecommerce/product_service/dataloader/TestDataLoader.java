package com.ecommerce.product_service.dataloader;

import com.ecommerce.product_service.model.Product;
import com.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class TestDataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product product = Product.builder()
                .name("Iphone 15")
                .description("Iphone 15 nuevo, 256GB")
                .price(BigDecimal.valueOf(1500))
                .build();

        productRepository.save(product);

        System.out.println("Datos de prueba cargados " + product.getName() );
    }
}
