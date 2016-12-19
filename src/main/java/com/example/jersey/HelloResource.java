package com.example.jersey;

import com.example.jersey.data.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @Autowired
    private DemoDao dao;

    @GET
    public String get() {
        return dao.getRandomValue();
    }
}
