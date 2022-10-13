package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IEncabPedidoDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.EncabPedido;

@Service
public class EncabPedidoServiceImp implements IEncabPedidoService {

    @Autowired
    private IEncabPedidoDao encabPedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<EncabPedido> findAll() {
        return encabPedidoDao.findAll();
    }

    @Override
    @Transactional
    public void save(EncabPedido encabPedido) {
        encabPedidoDao.save(encabPedido);
    }

    @Override
    @Transactional(readOnly = true)
    public EncabPedido findOne(Long idPedido) {
        return encabPedidoDao.findOne(idPedido);
    }

    @Override
    @Transactional
    public void delete(Long idPedido) {
        encabPedidoDao.delete(idPedido);
    }

}
