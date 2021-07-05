package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio {

	@Test
	public void testaParticipacaoCalcioCtcSolo() {

		assertEquals(0.4468580294802172, new CorrecaoCalcio().calculaParticipacaoCalcioCtcSolo(5.76, 1.63, 0.15, 5.35));
	}
}
