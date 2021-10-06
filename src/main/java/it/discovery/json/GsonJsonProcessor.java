package it.discovery.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import it.discovery.json.model.User;

import java.util.Map;

public class GsonJsonProcessor implements JsonProcessor {
    private final Gson gson = new Gson();

    @Override
    public String toJson(User user) {
        return gson.toJson(user);
    }

    @Override
    public User fromJson(String json) {
        return gson.fromJson(json, User.class);
    }

    @Override
    public Map<String, Object> fromJsonAsMap(String json) {
        return gson.fromJson(json, Map.class);
    }

    @Override
    public String getUserName(String json) {
        JsonElement element = JsonParser.parseString(json);
        return element.getAsJsonObject().get("name").getAsString();
    }
}
