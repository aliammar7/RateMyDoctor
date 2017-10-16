package com.coffeecode.ratemydoctor.models;

import com.coffeecode.ratemydoctor.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Ammar on 8/28/17.
 */
@Entity
@Data
public class Doctor extends MainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_gen")
    @SequenceGenerator(name = "doctor_gen", sequenceName = "doctor_seq")
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender sex;
    private Integer location;

    @OneToMany(mappedBy = "doctor")
    private Set<Review> reviews;



}
