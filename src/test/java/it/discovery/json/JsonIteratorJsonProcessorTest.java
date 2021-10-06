package it.discovery.json;

import it.discovery.json.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonIteratorJsonProcessorTest {

    User user;

    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastName("Williams");
        processor = new JsonIteratorJsonProcessor();
    }

    @Test
    void toJson_validObject_success() {
        String json = processor.toJson(user);
        //TODO verify
    }

    @Test
    void fromJson_validJson_success() throws IOException {
        String json = Files.readString(Paths.get("src/test/resources/sample.json"));
        User user = processor.fromJson(json);
        assertEquals("Peter", user.getName());
        assertEquals("Jones", user.getLastName());
    }

    @Test
    void getUsername_validJson_success() throws IOException {
        String json = Files.readString(Paths.get("src/test/resources/sample.json"));
        String name = processor.getUserName(json);
        assertEquals("Peter", name);
    }
}
