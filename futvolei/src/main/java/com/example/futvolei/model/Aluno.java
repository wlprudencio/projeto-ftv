package com.example.futvolei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "alunos")
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Aluno;

    @Column(name = "nomeCompleto", nullable = false, length = 50)
    private String nomeCompleto;

    @Column(name = "cpf", nullable = true, length = 50)
    private Long cpf;

    @Column(name = "email", nullable = true, length = 50, unique = true)
    private String email;

    @Column(name = "senha", nullable = false, length = 50)
    private String senha;
}
