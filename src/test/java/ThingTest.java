import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

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

    @Test
    void something_with_spy() {
        var thing = spy(new Thing());
        doReturn("bla").when(thing).callForAction();

        assertThat(thing.callForAction()).isEqualTo("bla");
    }

    @Test
    void it_should_not_fail_when_mocked() {
        Thing thing = mock(Thing.class);
        when(thing.callForAction()).thenReturn("Food");
        String value = thing.callForAction();
        assertThat(value)
                .isEqualTo("Food");
    }
}
