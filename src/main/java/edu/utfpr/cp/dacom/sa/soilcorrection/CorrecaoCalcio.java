package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcio {
  public double calculaParticipacaoCalcioCtcSolo(double calcio, double magnesio, double potassio,
      double aluminioHidrogenio) {

    return calcio / new EquilibrioCorrecaoCTC().calculaCTCCmol(potassio, calcio, magnesio, aluminioHidrogenio);

  }
}
