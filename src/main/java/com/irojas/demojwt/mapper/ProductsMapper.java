package com.irojas.demojwt.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.irojas.demojwt.entity.Products;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProductsMapper extends BaseMapper<Products> {
    @Select("""
        SELECT p.*
        FROM Products p
        JOIN Categories c ON p.CategoryID = c.CategoryID
        WHERE c.CategoryName = #{categoryName}
        ORDER BY p.ProductName
    """)
    List<Products> findByCategoryName(@Param("categoryName") String categoryName);


}
