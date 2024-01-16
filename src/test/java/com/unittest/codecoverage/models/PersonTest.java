package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PersonTest {
    @Test
    public void testSetName_shouldSetCorrectValue() {
        Person person = new Person();

        person.setName("Dariush Amiri");

        assertThat(person.getName()).isEqualTo("Dariush Amiri");
    }

    @Test
    public void testGetName_shouldReturnDefaultValue() {
        Person person = new Person();

        String result = person.getName();

        assertThat(result).isNull();
    }

    @Test
    public void testSetGender_shouldSetCorrectValue() {
        Person person = new Person();

        person.setGender(Gender.M);

        assertThat(person.getGender()).isEqualTo(Gender.M);
    }

    @Test
    public void testGetGender_shouldReturnDefaultValue() {
        Person person = new Person();

        Gender result = person.getGender();

        assertThat(result).isNull();
    }

    @Test
    public void testSetAge_shouldSetCorrectValue() {
        Person person = new Person();

        person.setAge(23);

        assertThat(person.getAge()).isEqualTo(23);
    }

    @Test
    public void testGetAge_shouldReturnDefaultValue() {
        Person person = new Person();

        int result = person.getAge();

        assertThat(result).isZero();
    }

}
