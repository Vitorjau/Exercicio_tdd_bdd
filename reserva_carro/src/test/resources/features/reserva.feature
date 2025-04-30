Feature: Reserva de Carro
  Como passageiro do app
  Quero reservar um carro informando meu local
  Para me deslocar com comodidade e segurança

  @cobertura
  Scenario: Reserva dentro da área de cobertura
    Given o passageiro informa a cidade "Belo Horizonte" e o endereço "Rua A, 123"
    When o sistema processa a reserva
    Then a mensagem retornada deve ser "Motorista a caminho"

  @fora
  Scenario: Reserva fora da área de cobertura
    Given o passageiro informa a cidade "Campinas" e o endereço "Av B, 456"
    When o sistema processa a reserva
    Then a mensagem retornada deve ser "Área fora de cobertura"