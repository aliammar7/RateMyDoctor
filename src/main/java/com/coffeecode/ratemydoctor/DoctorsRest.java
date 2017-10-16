package com.coffeecode.ratemydoctor;

import com.coffeecode.ratemydoctor.facade.DoctorFacade;

import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.Serializable;

/**
 * Created by Ammar on 9/23/17.
 */
@Singleton
@Path("beats")
public class DoctorsRest implements Serializable {


    @Inject
    DoctorFacade doctorFacade;

    @GET
    public String findAllDoctors() {
        return JsonbBuilder.create().toJson(doctorFacade.findAll());

    }



}
