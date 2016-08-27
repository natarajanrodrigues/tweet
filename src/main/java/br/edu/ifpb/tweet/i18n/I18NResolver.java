/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tweet.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Natarajan Rodrigues
 */
public class I18NResolver {

    @Produces
//    @SessionScoped
    public ResourceBundle getResourceBundle() {

        /*
		 * Aqui o local da nossa aplica��o. A classe Locale contem um enum com v�rios locais
		 * Incluindo US. Ao utilizar "Locale.getDefault()", temos o local definido pela JVM, que �
		 * o mesmo da m�quina que ela est� instalada.
         */
        Locale locale = Locale.getDefault();

        /*
		 * O nome 'base' para o nosso arquivo de Strings internacionalizadas.
		 * Veja dentro de src/main/resources que temos 2 arquivos que come�am com "i18n"
		 * Isso � o basename! O que complementa o nome do arquivo � a que linguagem ele
		 * pertence! "en_US" no caso de Ingl�s Americano ou "pt_BR" para Portugu�s do Brasil
         */
        String basename = "i18n";

        /*
		 * Recuperamos o ResourceBundle para a localidade que definimos
         */
        return ResourceBundle.getBundle(basename, locale);

    }

}
