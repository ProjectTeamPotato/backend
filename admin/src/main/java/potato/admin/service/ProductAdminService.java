package potato.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.Product;
import potato.admin.domain.message.ProductCreateRequest;
import potato.admin.domain.message.ProductUpdateRequest;
import potato.admin.repository.ProductRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ProductAdminService {
    private final ProductRepository productRepository;

    public void create(ProductCreateRequest productCreateRequest) {
        productRepository.save(productCreateRequest.toEntity());
        //추가: 생성 성공 or 실패 정보 return
    }

    @Transactional
    public void update(Long productId, ProductUpdateRequest productUpdateRequest) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.update(productUpdateRequest);
    }

    public Product getProduct(Long productId) {
        return productRepository.findById(productId).orElseThrow();
    }
}

