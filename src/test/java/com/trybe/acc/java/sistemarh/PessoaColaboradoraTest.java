package com.trybe.acc.java.sistemarh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaColaboradoraTest {


  @Test
  @DisplayName("10. Descrição do teste 1 aqui")
  public void testeCalcularSalarioLiquido() {
    PessoaColaboradora pessoa = new PessoaColaboradora();
    pessoa.setSalarioBruto(3000);
    assertEquals(2400, pessoa.calcularSalarioLiquido());
  }


  @Test
  @DisplayName("11. Descrição do teste 2 aqui")
  public void testeCalcularValorBrutoRecebidoAnual() {
    PessoaColaboradora pessoa = new PessoaColaboradora();
    pessoa.setSalarioBruto(3000);
    assertEquals(180000, pessoa.calcularValorBrutoRecebidoAnual(5));
  }


  @Test
  @DisplayName("12. Descrição do teste 3 aqui")
  public void testeCalcularValorLiquidoRecebidoAnual() {
    PessoaColaboradora pessoa = new PessoaColaboradora();
    pessoa.setSalarioBruto(3000);
    assertEquals(144000, pessoa.calcularValorLiquidoRecebidoAnual(5));
  }


  @Test
  @DisplayName("13. Descrição do teste 4 aqui")
  public void testeCalcularValorImpostoAnual() {
    PessoaColaboradora pessoa = new PessoaColaboradora();
    pessoa.setSalarioBruto(3000);
    assertEquals(36000, pessoa.calcularValorImpostoAnual(5));
  }

}
