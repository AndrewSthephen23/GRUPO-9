import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testRestar_PositiveNumbers_ShouldReturnCorrectSubtraction() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }
    @Test
    public void testMultiplicacion_PositiveNumbers_ShouldReturnCorrectMultiplicacion() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }
    @Test
    public void testDivision_PositiveNumbers_ShouldReturnCorrectDivision() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2.0, resultado, "10/5 deberia ser 2.0");
    }
    @Test
    public void testSum_DivideZero_ShouldThrowAritmeticExceptio() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            //Act
            calculador.division(numeroA,numeroB);
        },"Division por cero debe lanzar AritmeticException");
    }
}
