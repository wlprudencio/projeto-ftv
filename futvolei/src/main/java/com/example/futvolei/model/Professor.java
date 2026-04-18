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
@Table(name = "professores")
@Entity
public class Professor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_Professor;
        @Column(name = "nomeCompleto", nullable = false, length = 50)
        private String nomeCompleto;
        @Column(name = "Cpf", nullable = false, length = 50)
        private Long CPF;
        @Column(name = "email", nullable = false, length = 50)
        private String email;
        @Column(name = "senha", nullable = false, length = 50)
        private Long senha;
    }

