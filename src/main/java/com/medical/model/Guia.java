package com.medical.model;

import java.math.BigDecimal;

public class Guia {
    private Long id;
    private String numeroGuia;
    private Procedimento procedimento;
    private BigDecimal sessoesAutorizadas;
    private BigDecimal sessoesExecutadas;
    private BigDecimal sessoesRestantes;
}
