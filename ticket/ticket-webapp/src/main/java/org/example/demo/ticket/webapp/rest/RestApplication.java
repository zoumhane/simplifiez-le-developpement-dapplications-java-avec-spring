package org.example.demo.ticket.webapp.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


/**
 * Classe de configuration de l'application REST
 *pécifique au framework Jersey pour l'implémetation des webservices REST avec JAX-RS.
 * @author lgu
 */
@ApplicationPath("/")
public class RestApplication extends ResourceConfig {

    /**
     * Constructeur par défaut.
     */
    public RestApplication() {
        packages("org.example.demo.ticket.webapp.rest");
    }
}
