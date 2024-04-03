package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddress = new Address("street B");
    private Client client;
    @BeforeEach //hace que junit ejecuta este metodo antes que otros metodos
    void setUp(){ //este metodo se ejecuta antes que la prueba
        client = new Client();

    }
    @Test
    void afterCreationShouldHaveNoAddress(){ //segundo metodo en ejecutarse y vuelve a setup
//...assert that client has no address
    }
    @Test
    void shouldAllowToAddAddress(){ //tercero en ejecutarse y vuelve a SetUp
        client.addAddress(address);
        //...assert that client has this one address
    }
    @Test
    void shouldAllowToAddManyAddresses(){
        client.addAddress(address);
        client.addAddress(secondAddress);
        //...assert that client has two addresses
    }
}
