package com.example.futvolei.servico.impl;

import com.example.futvolei.model.Agendamento;
import com.example.futvolei.repository.AgendamentoRepository;
import com.example.futvolei.servico.AgendamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoServicoImpl implements AgendamentoServico {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Override
    public List<Agendamento> listarTodos() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento salvar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento obterPorId(Long id) {
        Optional<Agendamento> agendamento = agendamentoRepository.findById(id);
        return agendamento.orElse(null);
    }

    @Override
    public void deletar(Long id) {
        agendamentoRepository.deleteById(id);
    }
}

