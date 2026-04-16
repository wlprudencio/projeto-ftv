package com.example.futvolei.controller;

import com.example.futvolei.model.Agendamento;
import com.example.futvolei.servico.AgendamentoServico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoServico agendamentoServico;

    @GetMapping("/agendamento")
    public String listarTodos(Model model) {
        List<Agendamento> agendamentos = agendamentoServico.listarTodos();
        model.addAttribute("agendamentos", agendamentos);
        return "agendamento/listar";
    }

    @GetMapping("/agendamento/{id}")
    public String mostrarFormularioNovo(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "agendamento/formulario";
    }

    @PostMapping("/agendamento/{id}")
    public String salvar(@Valid @ModelAttribute Agendamento agendamento, BindingResult result) {
        if (result.hasErrors()) {
            return "agendamento/formulario";
        }
        agendamentoServico.salvar(agendamento);
        return "redirect:/agendamento";
    }

    @GetMapping("/{id}")
    public String obterPorId(@PathVariable Long id, Model model) {
        Agendamento agendamento = agendamentoServico.obterPorId(id);
        if (agendamento == null) {
            return "error/404";
        }
        model.addAttribute("agendamento", agendamento);
        return "agendamento/detalhes";
    }

    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Long id) {
        agendamentoServico.deletar(id);
        return "redirect:/agendamento";
    }

    public boolean validardia() {

        return false;
    }
}
