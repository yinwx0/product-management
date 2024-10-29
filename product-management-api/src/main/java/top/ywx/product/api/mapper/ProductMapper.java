package top.ywx.product.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.ywx.product.api.entity.Product;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
