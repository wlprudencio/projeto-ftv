package com.example.futvolei.controller;

import com.example.futvolei.model.Aluno;
import com.example.futvolei.servico.impl.AlunoServicoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CadastroController {

    @Autowired
    private AlunoServicoImpl servico;

    @GetMapping("/alunos")
    public String mostraFormularioAluno(Model model) {
        model.addAttribute("alunos", servico.listarAluno());
        return "listaaluno";
    }

    @GetMapping("/alunos/cadastro")
    public String criarAluno(Aluno aluno) {
        return "formaluno";
    }

    @PostMapping("/alunos")
    public String guardarAluno(@ModelAttribute("alunos") Aluno aluno) {
        servico.guardarAluno(aluno);
        return "redirect:/alunos";
    }

    @GetMapping("/alunos/editar")
    public String obterAlunoPorId(@PathVariable("id") Long id) {
        servico.obterAlunoPorId(id);
        return "redirect:/alunos";
    }

    @GetMapping("/alunos/{id}")
    public String eliminarAluno(@PathVariable("id") Long id) {
        servico.eliminarAluno(id);
        return "redirect:/alunos";
    }

}
