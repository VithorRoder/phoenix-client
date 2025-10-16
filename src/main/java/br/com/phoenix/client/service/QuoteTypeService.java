package br.com.phoenix.client.service;

import br.com.phoenix.client.model.QuoteType;
import br.com.phoenix.client.net.ApiHttpClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class QuoteTypeService {

    private final ApiHttpClient http;
    private final ObjectMapper mapper = new ObjectMapper();

    public QuoteTypeService(ApiHttpClient http) {
        this.http = http;
    }

    public List<QuoteType> list() throws Exception {
        String json = http.get("/api/quote/type/");
        return mapper.readValue(json, new TypeReference<List<QuoteType>>() {
        });
    }

    public QuoteType create(String name) throws Exception {
        var node = mapper.createObjectNode();
        node.put("name", name);
        String json = http.postJson("/api/quote/type/", mapper.writeValueAsString(node));
        return mapper.readValue(json, QuoteType.class);
    }

    public QuoteType update(Long id, String name) throws Exception {
        var node = mapper.createObjectNode();
        node.put("id", id);
        node.put("name", name);
        String json = http.putJson("/api/quote/type/" + id, mapper.writeValueAsString(node));
        return mapper.readValue(json, QuoteType.class);
    }

    public void delete(Long id) throws Exception {
        http.delete("/api/quote/type/" + id);
    }

}
