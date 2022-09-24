package org.acme.openapi.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.openapi.model.Order;

@Path("/orders")
public class OrderAPI {

    private Set<Order> orders = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Order> getOrders(){
        return orders;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Order> addOrder(@Valid Order body){
        orders.add(body);
        return orders; 
    }    
}
