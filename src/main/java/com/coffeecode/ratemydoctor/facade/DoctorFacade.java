package com.coffeecode.ratemydoctor.facade;

import com.coffeecode.ratemydoctor.models.Doctor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Ammar on 9/23/17.
 */

@Stateless
public class DoctorFacade extends AbstractFacade<Doctor> {

    @PersistenceContext(name = "RateMyDoctor", unitName = "RateMyDoctor")
    EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

//    public Observable<Doctor> findDoctorsObservable() {
//        return fromStream(em.createQuery("select d from Doctor d").getResultStream());
//    }

}
