/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tweet.interfaces;

import br.edu.ifpb.tweet.entity.Message;
import java.util.List;

/**
 *
 * @author Natarajan Rodrigues
 */
public interface Repository {
    
    public void persiste(Message message);
    public List<Message> getAllMessages();

}
