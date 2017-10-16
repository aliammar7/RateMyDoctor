package com.coffeecode.ratemydoctor.models;

import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyVisibilityStrategy;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Ammar on 9/3/17.
 */

public abstract class MainEntity implements Serializable{


    public abstract Long getId();

    public String toJson(){
        JsonbConfig config=new JsonbConfig().withPropertyVisibilityStrategy(new PropertyVisibilityStrategy() {
            @Override
            public boolean isVisible(Field field) {
                return true;
            }

            @Override
            public boolean isVisible(Method method) {
                return false;
            }
        });
        return JsonbBuilder.newBuilder().withConfig(config).build().toJson(this);
    }
}
