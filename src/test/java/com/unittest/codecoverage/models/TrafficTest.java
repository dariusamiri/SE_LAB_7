package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TrafficTest {

    @Test
    public void testGetMaxSpeedAllowed_shouldReturnDefaultValue() {
        Traffic traffic = new Traffic();

        short result = traffic.getMaxSpeedAllowed();

        assertThat(result).isZero();
    }
}
