package com.example.futvolei.servico;

import com.example.futvolei.dtos.UsuarioDto;
import com.example.futvolei.model.Usuario;

public interface UsuarioServico { // Certifique-se que diz INTERFACE aqui
    Usuario findByUsuario(UsuarioDto usuario);
    boolean validaUsuario(String email, String senha);
}
