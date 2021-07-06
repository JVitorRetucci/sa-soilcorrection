package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcio {
  public double calculaParticipacaoCalcioCtcSolo(
      double calcio, 
      double magnesio, 
      double potassio,
      double aluminioHidrogenio) {

    return calcio / new EquilibrioCorrecaoCTC().calculaCTCCmol(potassio, calcio, magnesio, aluminioHidrogenio);

  }

  public String participacaoIdealCalcioCtcSolo(int textura) {
    String participacaoIdeal;
    
    switch (textura) {
      case 0 -> participacaoIdeal = "45 a 55"; //Solo Argiloso
      case 1 -> participacaoIdeal = "35 a 40"; //Solo Textua Média
      default -> throw new IllegalArgumentException();
    }

    return participacaoIdeal;
  }

}
