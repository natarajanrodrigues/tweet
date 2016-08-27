/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tweet.repositories;

import br.edu.ifpb.tweet.entity.Message;
import br.edu.ifpb.tweet.interfaces.BD;
import br.edu.ifpb.tweet.interfaces.Repository;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Natarajan Rodrigues
 */
@BD
public class RepositoryBD implements Repository {

    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");
    
    @Inject
    private EntityManager entityManager;
    
    private EntityManager getEntityManager() {
        if (entityManager == null  ||  !entityManager.isOpen()) {
            entityManager = EMF.createEntityManager();
        }
        
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        
        return entityManager;
    }
    
    @Override
    public void persiste(Message message) {
        
        getEntityManager().persist(message);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Message> getAllMessages() {

        Query q = entityManager.createQuery("FROM Message m");
        return q.getResultList();
        
    }
    
}
