package com.example.futvolei.servico;

import com.example.futvolei.model.Agendamento;
import java.util.List;

public interface AgendamentoServico {

    List<Agendamento> listarTodos();

    Agendamento salvar(Agendamento agendamento);

    Agendamento obterPorId(Long id);

    void deletar(Long id);
}
