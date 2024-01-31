package com.AME.Agreements.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayLoad implements Serializable {

    private PayloadData payload;

    // Getters and setters
    @Getter
    @Setter
    public static class PayloadData {
        private String access_token;

    }

}
