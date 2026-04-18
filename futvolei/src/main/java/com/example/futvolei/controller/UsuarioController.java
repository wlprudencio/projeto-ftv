package com.example.futvolei.controller;

import com.example.futvolei.dtos.UsuarioDto;
import com.example.futvolei.model.Usuario;
import com.example.futvolei.servico.UsuarioServico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

   @Autowired
  private UsuarioServico servico;

    @GetMapping("/login")
 public String usuariologin(UsuarioDto usuarioDto) {
      return "loginusuario"; // Retorna a página de login
    }


	/*
	 * @PostMapping("/login") public String validausuario(@Valid @ModelAttribute
	 * UsuarioDto usuarioDto, BindingResult result) { if(result.hasErrors()) return
	 * "loginusuario"; // Verifica se o usuário existe no banco de dados Usuario
	 * user = this.servico.findByUsuario(usuarioDto);
	 * 
	 * if (user != null && user.getSenha().equals(usuarioDto.getSenha())) return
	 * "redirect:/home";
	 * 
	 * return "home"; }
	 */
}

