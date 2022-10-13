package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.EncabPedido;

@Repository("EncapPedidoDaoJPA")
public class EncabPedidoDaoImp implements IEncabPedidoDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    @Transactional(readOnly = true)
    public List<EncabPedido> findAll() {
        return em.createQuery("from EncabPedido").getResultList();
    }

    @Override
    @Transactional
    public void save(EncabPedido encabPedido) {

        if (encabPedido.getIdPedido() != null && encabPedido.getIdPedido() > 0) {
            em.merge(encabPedido);
        } else {
            em.persist(encabPedido);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public EncabPedido findOne(Long idPedido) {
        return em.find(EncabPedido.class, idPedido);
    }

    @Override
    @Transactional
    public void delete(Long idPedido) {
        EncabPedido encabPedido = findOne(idPedido);
        em.remove(encabPedido);
    }

}
