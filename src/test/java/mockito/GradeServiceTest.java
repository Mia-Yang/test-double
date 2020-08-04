package mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import static org.mockito.Mockito.*;


public class GradeServiceTest {
    private GradeService gradeService;
    private GradeSystem gradeSystem;
    @BeforeEach
    void setUp() {
        gradeSystem = mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(777L)).thenReturn(Arrays.asList(90.0, 80.0, 100.0));
        double result = gradeService.calculateAverageGrades(777L);
        assertEquals(90.0, result);
    }
}
