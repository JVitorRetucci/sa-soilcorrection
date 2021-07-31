package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

@FieldDefaults(makeFinal = true, level=AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class NutrienteAdicional {

    @NonNull
    NomeNutrienteAdicional nome;

    @Getter
    @PackagePrivate double teorNutriente;

    @Getter
    @Setter
    @NonFinal double correcaoAdicional;
    
}
