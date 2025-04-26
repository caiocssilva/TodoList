package br.com.caio.todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data // Gera getters, setters, toString, equals, hashCode
@NoArgsConstructor // Gera construtor vazio (obrigatório pro JPA)
@AllArgsConstructor // Gera construtor com todos os campos
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    private boolean realizado;

    private int prioridade;

}
