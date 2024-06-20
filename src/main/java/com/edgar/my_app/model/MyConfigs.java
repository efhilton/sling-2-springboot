package com.edgar.my_app.model;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MyConfigs {

    @Size(max = 255)
    private String shortName;

}
