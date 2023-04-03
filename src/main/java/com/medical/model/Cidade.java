package com.medical.model;

public class Cidade {
    private Long id;
    // @NotBlank
    //@Column(nullable = false)
    private String nome;

    //@Valid
    //@ConvertGroup(from = Default.class, to = Groups.EstadoId.class)
    // @NotNull
    // @ManyToOne
    // @JoinColumn(nullable = false)
    private Estado estado;
}
