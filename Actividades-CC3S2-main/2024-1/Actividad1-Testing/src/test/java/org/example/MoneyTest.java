package org.example;
import org.junit.jupiter.api.Test; //reconoce como una linea de prueba
import static org.assertj.core.api.Assertions.assertThat; //hace una importacion estatica de la clase assertj

class MoneyTest { // tiene que terminar en la palabra test, no tiene que ser publico
    @Test
    void constructorShouldSetAmountAndCurrency() { //Es el metodo de prueba
        // Completa
        Money money = new Money(10,"USD"); // Se crea el SUT
        assertThat(money.getAmount()).isEqualTo(10); //el SUT se pone a prueba
        assertThat(money.getCurrency()).isEqualTo("USD");//el SUT se pone a prueba| isEqualTo -> compara

    }

}