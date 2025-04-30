package reserva;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes unitários para a classe ReservaService.
 */
public class ReservaServiceTest {
    private ReservaService service;

    @Before
    public void setUp() {
        // inicializa instância antes de cada teste
        service = new ReservaService();
    }

    @Test
    public void testeReservaDentroCobertura_BeloHorizonte() {
        // cenário: cidade dentro da cobertura
        String retorno = service.reservar("Belo Horizonte", "Av A, 100");
        assertEquals("Motorista a caminho", retorno);
    }

    @Test
    public void testeReservaDentroCobertura_Contagem() {
        // cenário: outra cidade dentro da cobertura
        String retorno = service.reservar("Contagem", "Rua B, 200");
        assertEquals("Motorista a caminho", retorno);
    }

    @Test
    public void testeReservaForaCobertura() {
        // cenário: cidade fora da cobertura
        String retorno = service.reservar("São Paulo", "Rua C, 300");
        assertEquals("Área fora de cobertura", retorno);
    }
}