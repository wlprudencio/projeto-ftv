package com.example.futvolei.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name ="usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false, length = 50)
    private Long idusuario;
    @Column(name= "email", nullable = false, length = 50)
    private String email;
    @Column(name= "senha", nullable = false, length = 50)
    private Long senha;

}
