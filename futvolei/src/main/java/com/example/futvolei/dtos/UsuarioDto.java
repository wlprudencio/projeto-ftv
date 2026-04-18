package com.example.futvolei.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

    @NotNull
    private String email;
    @NotNull
    private String senha;
}
