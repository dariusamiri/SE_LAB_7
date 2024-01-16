package com.unittest.codecoverage.models;

import com.unittest.codecoverage.models.Footpassenger;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FootpassengerTest {
    @Test
    public void testCrossedTheCrosswalk_shouldReturnDefaultValue() {
        Footpassenger footpassenger = new Footpassenger();

        boolean result = footpassenger.crossedTheCrosswalk();

        assertThat(result).isFalse();
    }
}
