package com.example.futvolei.servico.impl;

import com.example.futvolei.model.Aluno;
import com.example.futvolei.repository.AlunoRepository;
import com.example.futvolei.servico.AlunoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServicoImpl implements AlunoServico {

    @Autowired
    private AlunoRepository repository;

    @Override
    public List<Aluno> listarAluno() {
        List<Aluno> aluno = repository.findAll();
        return aluno;
    }

    @Override
    public void guardarAluno() {
    }
    @Override
    public Aluno guardarAluno(Aluno aluno) {

        return repository.save(aluno);
    }
    @Override
    public Aluno obterAlunoPorId(Long id) {

        return repository.findById(id).get();
    }
    @Override
    public void eliminarAluno() {
    }
    @Override
    public void eliminarAluno(Long id) {
        repository.deleteById(id);
    }
}
