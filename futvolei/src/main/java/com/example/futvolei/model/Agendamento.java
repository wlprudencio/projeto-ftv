package com.example.futvolei.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "agendamentos")
@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Agendamento;
    @Column(name = "iniciante", nullable = false, length = 50)
    private String iniciante;
    @Column(name = "avancado", nullable = false, length = 50)
    private String avancado;
    @Column(name = "intermediario", nullable = false, length = 50)
    private String intermediario;
    @Column(name = "data", nullable = false, length = 50)
    private Date data;
    @Column(name = "hora", nullable = false, length = 50)
    private String hora;

}
