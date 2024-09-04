package learningtest.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ToString}.
 *
 * @author Johnny Lim
 */
class ToStringTests {

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
        assertThat(person.toString()).contains("super=");
    }

    @Getter
    @Setter
    @ToString(callSuper = true)
    static class Person {

        private String firstName;

        private String lastName;

    }

}
