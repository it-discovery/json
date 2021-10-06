package it.discovery.json;

import it.discovery.json.model.User;

import java.util.Map;

public interface JsonProcessor {

	String toJson(User user);

	User fromJson(String json);

	Map<String, Object> fromJsonAsMap(String json);

	String getUserName(String json);
}
