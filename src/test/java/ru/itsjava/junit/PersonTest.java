package ru.itsjava.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Vova";
    public static final int DEFAULT_AGE = 23;
    public static final String NEW_NAME = "Anna";
    public static final int NEW_AGE = 35;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                ()-> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }

    @DisplayName(" коректно работают изменения")
    @Test
    public void shouldHaveCorrectUpdate() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setName(NEW_NAME);
        actualPerson.setAge(NEW_AGE);

        assertEquals(NEW_NAME, actualPerson.getName());
        assertEquals(NEW_AGE, actualPerson.getAge());
    }
}
