package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "encabezado_pedidos")
public class EncabPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private long idPedido;

    @NotNull
    @Column(name = "id_cliente")
    private long idCliente;

    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha;

    @NotNull
    @Column(name = "cel_destino")
    private long CelularDestino;

    @NotEmpty
    @Column(name = "dir_destino")
    private String DireccionDestino;

    @NotEmpty
    @Column(name = "nom_destino")
    private String NombreDestino;

    @NotNull
    private long Subtotal;

    @NotNull
    private long Total;

    @NotNull
    private long Descuento;

    @NotNull
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date FechaEntrega;

    @NotEmpty
    private String Estado;

    /*
     * @PrePersist // Para decir que la fecha es de hoy
     * public void PrePersist() {
     * Fecha = new Date();
     * }
     */

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Long getCelularDestino() {
        return CelularDestino;
    }

    public void setCelularDestino(Long celularDestino) {
        CelularDestino = celularDestino;
    }

    public String getDireccionDestino() {
        return DireccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        DireccionDestino = direccionDestino;
    }

    public String getNombreDestino() {
        return NombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        NombreDestino = nombreDestino;
    }

    public Long getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Long subtotal) {
        Subtotal = subtotal;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long total) {
        Total = total;
    }

    public Long getDescuento() {
        return Descuento;
    }

    public void setDescuento(Long descuento) {
        Descuento = descuento;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

}
