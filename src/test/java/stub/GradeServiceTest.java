package stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private StubGradeSystem stubGradeSystem;
    private GradeService gradeService;

    @BeforeEach
    public void setup() {
        stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        double result = gradeService.calculateAverageGrades(9999L);
        assertEquals(90.0, result);
    }
}

