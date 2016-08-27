/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tweet.service;

import br.edu.ifpb.tweet.entity.Message;
import br.edu.ifpb.tweet.interfaces.BD;
import br.edu.ifpb.tweet.interfaces.Repository;
import java.util.List;
import java.util.ResourceBundle;
import javax.inject.Inject;

/**
 *
 * @author Natarajan Rodrigues
 */
public class Service {
    
    @Inject
    private ResourceBundle i18nResource;
    
    @Inject
    @BD
    private Repository repository;

    public Service() {
    }
    
    public void salvaMensagem(Message m) {
        repository.persiste(m);
    }
    
    public List<Message> getMessages() {
        return repository.getAllMessages();
                
    }
    
    public String getI18n(String key) {
        return i18nResource.getString(key);
    }
    
}
