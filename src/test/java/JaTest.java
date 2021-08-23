import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SuppressWarnings("unused")
public class JaTest {


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

    public static Object[][] genderDataProvider() {

        return  new Object[][]{
                {"male", 16, "boy"},
                {"female", 22, "woman"},
                {"male", 36, "man"},
                {"female", 10, "girl"}
        };

    }
    @ParameterizedTest
    @MethodSource("genderDataProvider")
    void TestIsWho2(String  gender, int age, String  expectedResult) {

        String result = Person.isWho(gender,age);
        System.out.println(result);
        assertEquals(expectedResult, result);

    }


}
