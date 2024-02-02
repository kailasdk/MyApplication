package com.AME.Agreements.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.AME.Agreements.dto.PayLoad;
import com.AME.Agreements.dto.TokenRequestDto;
import com.AME.Agreements.service.PresetService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Service
public class PresetServiceImpl implements PresetService {

    @Autowired
    ObjectMapper objectMapper;
    @Value("${name}")
    String name;

    @Override
    public String getTeams() {
        String name = "a70680d4-6aad-4f8e-b051-3ced797df50d";
        String secret = "3e3fa2e186e1ac487e74af8e294dff3021a17abbd4858b99f1993891630b2597";

        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6ImtleTIifQ.eyJhdWQiOiJodHRwczovL21hbmFnZS5hcHAucHJlc2V0LmlvIiwiZXhwIjoxNzA2NjQ5MzA2LCJmcmVzaCI6dHJ1ZSwiaXNzIjoiaHR0cHM6Ly9tYW5hZ2UuYXBwLnByZXNldC5pbyIsInN1YiI6Imdvb2dsZS1vYXV0aDJ8MTA2OTQwNTk5OTEyODA1OTYzMjY1IiwidHlwZSI6ImFjY2VzcyIsImlhdCI6MTcwNjYzMTMwNiwibmJmIjoxNzA2NjMxMjk2LCJqdGkiOiIwNjkyZmJiYS1mMzFiLTQ3NDEtYWMyMC1hM2UwZDk4ODk2MTAiLCJjc3JmIjoiMDBiODYzMGItMjMwNS00YjhlLWE4YTktOTE0M2Y0YWVlN2NkIiwiZGlkIjoibWFpbiIsInVzZXJfaW5mbyI6eyJpZCI6NTkwNDAsImZpcnN0X25hbWUiOiJUZW1wIiwibGFzdF9uYW1lIjoiSWQiLCJlbWFpbCI6ImlkdGVtcDc3QGdtYWlsLmNvbSIsIm9uYm9hcmRlZCI6dHJ1ZSwidXNlcm5hbWUiOiJnb29nbGUtb2F1dGgyfDEwNjk0MDU5OTkxMjgwNTk2MzI2NSIsInBlcm1zIjpbXSwiYXBpX2tleV9uYW1lIjoiYTcwNjgwZDQtNmFhZC00ZjhlLWIwNTEtM2NlZDc5N2RmNTBkIn19.Qs5TypHRt5ersweGzzWzL8AnREIuf1H1rShUaECq6RdF8Qe9vCnqnLEqpEgiEvAf-qehFJD78u2C7SUSdosdEUPTCSGrOZkDznJuETtuolrdnKj0NvweDF84qx2zepDJbzQrvlzXt-xsOOikyQ23Y2FPAiP-r67IW1M_bLSwrguLUb0owT_UyFyz3OTdEnt0ed7VTtUp7p5X9TJ6Gog5lpZjkKZaLoI4ajfJxZrO3W23871MLEoq79lQcO4ee7lsosNBQ_99SaUwEbFzaosUmun5yh-iosN36zXR4cA1W2LS7FquIUxPyuuyRnbLfKGQgoVO_KmdR2R_DI4rV2DtgHg8vHGpIZEdOdeetALlbck0I9wCDrEpqxO6rihLcTZ0fOT-s8ruD_NBJXGcl1fY4u40njIHj8t9-RM1zm0E64jZEAe5xaPkNvP_RdeplKd7sYpx_IjWTcuktldbf0rY3g6iMEIgkmf0h45NsBX6pVT9UJsNtm4O3XMzcWm40o3pAfUrNHRQTGUk1U0YikhFaPQkXPxtkWndj1M5POuG_e8O4fzBygGge-0P0cD2NT8taJRayJzhIuA_jRcX1TN09MwjL6ecJCMZibuxY2PFMjXm-wBpP9mZ6NaGbqJjsIYUT9dQ_6nAUYjqkRSJjPOdgEr_AALlVJ-ocn5Ya6EJaMo";

        String uri = "https://api.app.preset.io/v1/teams/";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("token", token);

        HttpEntity<MultiValueMap<String, Object>> reqest = new HttpEntity<>(map, headers);
        ResponseEntity<Object> respose = restTemplate.exchange(uri, HttpMethod.GET, reqest, Object.class);
        System.err.println(respose);

        return new Gson().toJson(respose);

    }

    @Override
    public String getToken() {
        // try {

        TokenRequestDto tokenRequestDto = TokenRequestDto.builder()
                .name("a70680d4-6aad-4f8e-b051-3ced797df50d")
                .secret("3e3fa2e186e1ac487e74af8e294dff3021a17abbd4858b99f1993891630b2597")
                .build();

        String name = "a70680d4-6aad-4f8e-b051-3ced797df50d";
        String secret = "3e3fa2e186e1ac487e74af8e294dff3021a17abbd4858b99f1993891630b2597";
        String body = "{\"name\": \"\"+, \"secret\": \"3e3fa2e186e1ac487e74af8e294dff3021a17abbd4858b99f1993891630b2597\"}";
        String uri = "https://api.app.preset.io/v1/auth/";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requesEntity = new HttpEntity<>(new Gson().toJson(tokenRequestDto), headers);

        ResponseEntity<String> respose = restTemplate.exchange(uri, HttpMethod.POST, requesEntity, String.class);

        PayLoad paylod = new Gson().fromJson(respose.getBody(), PayLoad.class);

        System.out.println(paylod.getPayload().getAccess_token());
        System.out.println("Name=>"+name    );

        //
        return paylod.getPayload().getAccess_token();

    }

}
