package top.ywx.product.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import top.ywx.product.api.entity.Product;
import top.ywx.product.api.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    //查询所有商品
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.list();
    }

    //查询单个商品
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getById(id);
    }

    //创建商品
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    //更新商品
    @PutMapping("/{id}")
    public Boolean updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateById(product);
    }

    //删除商品
    @DeleteMapping("/{id}")
    public Boolean deleteProduct(@PathVariable Long id) {
        return productService.removeById(id);
    }
}

