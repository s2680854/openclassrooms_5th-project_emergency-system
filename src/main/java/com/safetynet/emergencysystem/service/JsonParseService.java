package com.safetynet.emergencysystem.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonParseService {

    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        defaultObjectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return defaultObjectMapper;
    }

    public static ObjectMapper objectMapper = getDefaultObjectMapper();

    public static JsonNode parse(String src) throws IOException {

        return objectMapper.readTree(src);
    }

    public static JsonNode toJson(Object objectTargeted) {

        return objectMapper.valueToTree(objectTargeted);
    }
}
