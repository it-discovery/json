package it.discovery.json;

import com.jayway.jsonpath.JsonPath;
import it.discovery.json.model.User;

import java.util.Map;

public class JsonPathJsonProcessor implements JsonProcessor {
    @Override
    public String toJson(User user) {
        throw new UnsupportedOperationException("Convertion from POJO to JSON is not supported by JsonPath");
    }

    @Override
    public User fromJson(String json) {
        return JsonPath.parse(json).read("$", User.class);
    }

    @Override
    public Map<String, Object> fromJsonAsMap(String json) {
        return JsonPath.parse(json).read("$", Map.class);
    }

    @Override
    public String getUserName(String json) {
        return JsonPath.parse(json).read("$.title", String.class);
    }
}
