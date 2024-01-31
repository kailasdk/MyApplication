package com.AME.Agreements.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TokenRequestDto implements Serializable {

    private String name;
    private String secret;


}
