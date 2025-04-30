package reserva;

/**
 * Serviço de reserva de carro para um aplicativo de mobilidade.
 * Contém lógica básica para verificar área de cobertura.
 */
public class ReservaService {

    /**
     * Reserva um carro informando a cidade e o endereço.
     * @param cidade Nome da cidade do passageiro.
     * @param endereco Endereço do passageiro (não usado na lógica atual).
     * @return Mensagem indicando se a reserva foi aceita ou não.
     */
    public String reservar(String cidade, String endereco) {
        // Verifica se a cidade está na área de cobertura
        if ("Belo Horizonte".equalsIgnoreCase(cidade)
                || "Contagem".equalsIgnoreCase(cidade)) {
            // retorna mensagem de sucesso
            return "Motorista a caminho";
        }
        // fora da área de cobertura
        return "Área fora de cobertura";
    }
}