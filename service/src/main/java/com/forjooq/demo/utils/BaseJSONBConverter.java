package com.forjooq.demo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jooq.Converter;

public class BaseJSONBConverter implements Converter<Object, JsonNode> {

    private ObjectMapper mapper;

    public BaseJSONBConverter() {
        this.mapper = new ObjectMapper();
    }

    @Override
    public JsonNode from(Object t) {
        return t == null ? mapper.createObjectNode() : mapper.valueToTree(t);
    }

    @Override
    public Object to(JsonNode u) {
        try {
            return u == null ? null : mapper.writeValueAsString(u);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public Class<Object> fromType() {
        return Object.class;
    }

    @Override
    public Class<JsonNode> toType() {
        return JsonNode.class;
    }
}
