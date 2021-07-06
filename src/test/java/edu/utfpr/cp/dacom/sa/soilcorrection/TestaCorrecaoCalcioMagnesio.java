package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio {

	@Test
	public void testaParticipacaoCalcioCtcSolo() {

		assertEquals(0.4468580294802172, new CorrecaoCalcio().calculaParticipacaoCalcioCtcSolo(5.76, 1.63, 0.15, 5.35));
	}

	@Test
	public void testaParticipaoIdealCalcio() {
		assertEquals("45 a 55", new CorrecaoCalcio().participacaoIdealCalcioCtcSolo(0)); //Teste argiloso
		assertEquals("35 a 40", new CorrecaoCalcio().participacaoIdealCalcioCtcSolo(1)); //Teste textura média
	}
}
