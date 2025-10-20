package learningtest.lombok;

import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests with first single-character word in field name.
 *
 * @author Johnny Lim
 */
class FirstSingleCharacterWordTests {

    @Test
    void test() {
        String value = "test";

        SomeData someData = new SomeData();
        someData.setAValue(value);

        assertThat(someData.getAValue()).isEqualTo(value);
    }

    @Data
    static class SomeData {

        private String aValue;

    }

}
