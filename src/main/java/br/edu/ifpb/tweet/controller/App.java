/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tweet.controller;

import br.edu.ifpb.tweet.service.Service;

/**
 *
 * @author Natarajan Rodrigues
 */
public class App {

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.getMessages().size());
    }
    
}
