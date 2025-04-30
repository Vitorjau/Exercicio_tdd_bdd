package reserva.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import reserva.ReservaService;
import static org.junit.Assert.*;

public class ReservaSteps {
    private String cidade;
    private String endereco;
    private String resultado;
    private ReservaService service = new ReservaService();

    @Dado("o passageiro informa a cidade {string} e o endereço {string}")
    public void informoCidadeEEndereco(String cidade, String endereco) {
        // captura inputs do cenário
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Quando("o sistema processa a reserva")
    public void processoReserva() {
        // chama o serviço de reserva
        resultado = service.reservar(cidade, endereco);
    }

    @Entao("a mensagem retornada deve ser {string}")
    public void verificaMensagem(String mensagemEsperada) {
        // valida se o retorno está correto
        assertEquals(mensagemEsperada, resultado);
    }
}