package br.com.challenge.sistematransacoes.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "instituicoes_financeiras")
public class InstituicaoFinanceira implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany
    private List<Agencia> agencias = new ArrayList<>();

    public InstituicaoFinanceira() {
    }

    public InstituicaoFinanceira(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InstituicaoFinanceira)) return false;
        InstituicaoFinanceira that = (InstituicaoFinanceira) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
