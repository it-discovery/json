package it.discovery.json;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import it.discovery.json.model.User;

import java.util.Map;

public class JsonIteratorJsonProcessor implements JsonProcessor {
    @Override
    public String toJson(User user) {
        return null;
    }

    @Override
    public User fromJson(String json) {
        return JsonIterator.deserialize(json, User.class);
    }

    @Override
    public Map<String, Object> fromJsonAsMap(String json) {
        return JsonIterator.deserialize(json, Map.class);
    }

    @Override
    public String getUserName(String json) {
        Any any = JsonIterator.deserialize(json);
        return any.get("name").toString();
    }
}
