package top.ywx.product.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.ywx.product.api.entity.Product;
import top.ywx.product.api.mapper.ProductMapper;
import top.ywx.product.api.service.ProductService;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
