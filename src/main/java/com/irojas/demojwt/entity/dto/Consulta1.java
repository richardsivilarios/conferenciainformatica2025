package com.irojas.demojwt.entity.dto;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consulta1  {
  private String nombrecategoria;
  private String nombreproducto;
  private String unidadproducto;
  private BigDecimal precioproducto;
  private String nombreproveedor;
  private String telefonoproveedor;
}
