package com.irojas.demojwt.mapper;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.irojas.demojwt.entity.dto.Consulta1;
import java.util.List;
public interface Consulta1Mapper extends BaseMapper<Consulta1> {
@Select("""
select distinct
c.categoryname as nombrecategoria, 
p.productname as nombreproducto,
p.unit as unidadproducto,
p.price as precioproducto,
s.suppliername as nombreproveedor,
s.phone as telefonoproveedor
from 
Categories c, Products p, Suppliers s
where 
c.categoryid = p.categoryid AND 
p.supplierid = s.supplierid
    """)
List<Consulta1> consulta1();

}
