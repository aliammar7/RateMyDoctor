package com.coffeecode.ratemydoctor.models.entityID;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * Created by Ammar on 9/10/17.
 */
@Data

public class ReviewId implements Serializable {

    private Long doctor;
    private Long patient;
}
