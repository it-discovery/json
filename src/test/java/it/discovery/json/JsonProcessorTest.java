package it.discovery.json;

import it.discovery.json.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JsonProcessorTest {

    User user;

    JsonProcessor processor;

    @BeforeEach
    void setup() {
        user = new User();
        user.setName("Antony");
        user.setLastName("Williams");
    }

    @Test
    void toJson_validObject_success() {

    }

}
