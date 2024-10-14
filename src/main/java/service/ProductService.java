package service;

import dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import model.Product;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

@Service
@RequiredArgsConstructor // c'est une annotation Lombock qui permet de faire
//l'injection de dependance via un constructeur

public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .Id(productRequest.Id())
                .Name(productRequest.Name())
                .Description(productRequest.Description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
    }
}
