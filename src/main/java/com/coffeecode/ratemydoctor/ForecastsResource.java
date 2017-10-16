package com.coffeecode.ratemydoctor;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Ammar on 8/12/17.
 */
@Path("/forecasts")
@Produces(value = "application/json")
public class ForecastsResource {

    @GET
    public JsonObject all(){
        System.out.println("test");
        return Json.createObjectBuilder().add("1","2").build();
      /*  try(JsonReader reader= Json.createReader(this.getClass().getResourceAsStream("doctor.json"))){
            return reader.readArray();
        }*/
    }}
