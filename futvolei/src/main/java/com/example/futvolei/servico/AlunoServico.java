package com.example.futvolei.servico;

import com.example.futvolei.model.Aluno;

import java.util.List;

public interface AlunoServico {

        public List<Aluno> listarAluno();

        void guardarAluno();

        public  Aluno guardarAluno(Aluno aluno);

        Aluno obterAlunoPorId(Long id);

        void eliminarAluno();

        public void eliminarAluno(Long id);
    }

