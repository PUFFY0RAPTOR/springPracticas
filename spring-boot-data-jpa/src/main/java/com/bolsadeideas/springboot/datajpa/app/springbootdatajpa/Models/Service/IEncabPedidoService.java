package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.EncabPedido;

public interface IEncabPedidoService {

    public List<EncabPedido> findAll();

    public void save(EncabPedido encabPedido);

    public EncabPedido findOne(Long idPedido);

    public void delete(Long idPedido);
}
