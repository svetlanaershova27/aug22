import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JiTest {


    public void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    @BeforeEach
    void setUp(){

    }
    @AfterEach
    void tearDown(){

    }

   private static Stream<Arguments> ageDataProvider() {
       return Stream.of(
               Arguments.of(10, false),
               Arguments.of(0, false),
               Arguments.of(16, true),
            Arguments.of(20, false),
        Arguments.of(19, true),
        Arguments.of(13, true),
        Arguments.of(-10, false)
               );

    }
    @ParameterizedTest
    @MethodSource("ageDataProvider")
    void TestIsTeenager2(int age, boolean expectedResult) {
        boolean result = Person.isTeenager(age);
        System.out.println(result);
        assertEquals(expectedResult, result);

    }

}

