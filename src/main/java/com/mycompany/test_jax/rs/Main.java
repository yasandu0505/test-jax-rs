/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_jax.rs;


/**
 *
 * @author yasandu
 */
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import java.io.IOException;
import java.net.URI;

public class Main {
    
    public static final String BASE_URI = "http://localhost:8080/api/";
    
    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("com.mycompany.test_jax.rs");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc); 
    }
    

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println("JAX-RS server running at " + BASE_URI);
        System.in.read();
        server.shutdownNow();
    }
}
