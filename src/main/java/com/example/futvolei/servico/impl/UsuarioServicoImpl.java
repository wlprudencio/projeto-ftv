package com.example.futvolei.servico.impl;

import com.example.futvolei.dtos.UsuarioDto;
import com.example.futvolei.model.Usuario;
import com.example.futvolei.servico.UsuarioServico;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicoImpl implements UsuarioServico { // Mudei de 'extends' para 'implements'

    @Override
    public Usuario findByUsuario(UsuarioDto usuario) {
        // sua lógica aqui (ex: buscar no repositório)
        return null;
    }

    @Override
    public boolean validaUsuario(String email, String senha) {
        // sua lógica aqui (ex: verificar senha)
        return false;
    }
}
