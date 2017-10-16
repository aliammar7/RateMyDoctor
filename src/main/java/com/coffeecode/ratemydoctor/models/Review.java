package com.coffeecode.ratemydoctor.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import java.io.Serializable;

/**
 * Created by Ammar on 9/10/17.
 */
@Data
@Entity
public class Review implements Serializable {


    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Doctor doctor;

    private String review;

    @Max(value = 5)
    private int rate;
}
