package org.example.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleTest {

    @Test
    void test() {
        Assertions.assertThat(true);
    }
}
