package edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class NutrienteAdicional {

    @NonNull
    private final NomeNutrienteAdicional nome;

    @Getter
    final double teorNutriente;

    @Getter
    @Setter
    private double correcaoAdicional;
    
}
