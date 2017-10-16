package com.coffeecode.ratemydoctor.models;

import com.coffeecode.ratemydoctor.enums.Gender;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Ammar on 9/17/17.
 */
@Entity
@Data
public class Patient implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_gen")
    @SequenceGenerator(name = "patient_gen", sequenceName = "patient_seq")
    @Getter
    private Long id;
    private String name;
    private Gender sex;
    private Integer location;

    @OneToMany(mappedBy = "patient")
    private Set<Review> reviews;

}
