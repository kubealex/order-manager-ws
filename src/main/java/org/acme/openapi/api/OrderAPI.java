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
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderAPI {

    private Set<Order> orders = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    @GET
    public Set<Order> getOrders(){
        return orders;
    }

/*     @POST
    public Set<Order> addOrder(@RestQuery String name, @RestQuery Integer price){
        System.out.println("This is the name: " + name + " and this is the price: " + price);
        orders.add(new Order(name, price));
        System.out.println()
        return orders;
    } */
    @POST
    public Set<Order> addOrder(@Valid Order body){
        System.out.println(body);
        orders.add(body);
        return orders; 
    }    
}
