package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.EncabPedido;

public interface IEncabPedidoDao {

    public List<EncabPedido> findAll();

    public void save(EncabPedido encabPedido);

    public EncabPedido findOne(Long idPedido);

    public void delete(Long idPedido);

}
