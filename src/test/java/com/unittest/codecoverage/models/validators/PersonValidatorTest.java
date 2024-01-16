package com.unittest.codecoverage.models.validators;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class PersonValidatorTest {

    @Test
    public void testRequiredName_withValidPerson_shouldReturnTrue() {
        PersonValidator validator = new PersonValidator();
        Person person = new Person();
        person.setName("Dariush");

        boolean result = validator.requiredName(person);

        assertThat(result).isTrue();
    }

    @Test
    public void testRequiredName_withValidName_shouldReturnTrue() {
        PersonValidator validator = new PersonValidator();
        String name = "Dariush Amiri";

        boolean result = validator.requiredName(name);

        assertThat(result).isTrue();
    }

}
