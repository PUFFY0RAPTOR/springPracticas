package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "detall_pedido")
public class DetallPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetalle;

    @NotNull
    @Column(name = "id_encabPedido")
    private long idEncabPedido;

    @NotNull
    @Column(name = "id_producto")
    private long idProducto;

    @NotNull
    @Column(name = "descuento_detalle")
    private long DescuentoDetalle;

    @NotNull
    private long Cantidad;

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Long getIdEncabPedido() {
        return idEncabPedido;
    }

    public void setIdEncabPedido(Long idEncabPedido) {
        this.idEncabPedido = idEncabPedido;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getDescuentoDetalle() {
        return DescuentoDetalle;
    }

    public void setDescuentoDetalle(Long descuentoDetalle) {
        DescuentoDetalle = descuentoDetalle;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

}
