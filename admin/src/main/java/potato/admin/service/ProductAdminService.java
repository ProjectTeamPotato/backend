package potato.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import potato.admin.domain.entity.Product;
import potato.admin.domain.message.ProductCreateRequest;
import potato.admin.domain.message.ProductUpdateRequest;
import potato.admin.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductAdminService {
    private final ProductRepository productRepository;

    public void create(ProductCreateRequest productCreateRequest) {
        Product product = productRepository.save(productCreateRequest.toEntity());
    }

    @Transactional
    public void update(Long productId, ProductUpdateRequest productUpdateRequest) {
        Optional<Product> product = productRepository.findById(productId);

        if (product.isEmpty()) {
            throw new RuntimeException();
        }

        product.get().update(productUpdateRequest);
    }

    public Product getProduct(Long productId) {
        return productRepository.findById(productId).orElseThrow();
    }
}
