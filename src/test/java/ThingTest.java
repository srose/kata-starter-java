import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ThingTest {

    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value)
                .isEqualTo("Food");
    }

    @Test
    void it_should_not_fail() {
        var expected = 42;

        assertThat(42)
                .isEqualTo(expected);
    }
}
