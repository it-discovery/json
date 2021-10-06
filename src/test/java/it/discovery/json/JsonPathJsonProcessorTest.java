package it.discovery.json;

import it.discovery.json.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JsonPathJsonProcessorTest {

    User user;

    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastName("Williams");
        processor = new JsonPathJsonProcessor();
    }

    @Test
    void toJson_validObject_success() {
        //TODO verify
    }

    @Test
    void fromJson_validJson_not_supported() throws IOException {
        assertThrows(Exception.class, () -> processor.toJson(user));
    }

    @Test
    void getUsername_validJson_success() throws IOException {
        String json = Files.readString(Paths.get("src/test/resources/sample.json"));
        String name = processor.getUserName(json);
        assertEquals("Peter", name);
    }
}
