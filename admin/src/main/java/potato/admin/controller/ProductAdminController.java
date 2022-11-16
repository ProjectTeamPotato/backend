package potato.admin.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import potato.admin.domain.message.ProductCreateRequest;
import potato.admin.domain.message.ProductGetResponse;
import potato.admin.domain.message.ProductUpdateRequest;
import potato.admin.service.ProductAdminService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductAdminController {
    private final ProductAdminService productAdminService;

    @PostMapping("/product")
    public String createProduct(@Validated @RequestBody ProductCreateRequest productCreateRequest) {
        productAdminService.create(productCreateRequest);
        return "product create test";
    }

    @PutMapping("/product/{product_id}")
    public String updateProduct(@PathVariable("product_id") Long productId, @RequestBody ProductUpdateRequest productUpdateRequest) {
        productAdminService.update(productId, productUpdateRequest);
        return "product update test";
    }

    @GetMapping("/product/{product_id}")
    public ProductGetResponse getHall(@PathVariable("product_id") Long productId) {
        return ProductGetResponse.of(productAdminService.getProduct(productId));
    }
}
