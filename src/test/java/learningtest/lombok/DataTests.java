package learningtest.lombok;

import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Data}.
 *
 * @author Johnny Lim
 */
class DataTests {

    @Test
    void test() {
        String firstName = "Johnny";
        String lastName = "Lim";

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        System.out.println(person);

        assertThat(person.getFirstName()).isEqualTo(firstName);
        assertThat(person.getLastName()).isEqualTo(lastName);
    }

    @Data
    static class Person {

        private String firstName;

        private String lastName;

    }

}
