package br.com.challenge.sistematransacoes.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "agencias")
public class Agencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    @OneToMany
    private List<Conta> contas;
    @ManyToOne
    private InstituicaoFinanceira instituicaoFinanceira;

    public Agencia() {
    }

    public Agencia(String numero, InstituicaoFinanceira instituicaoFinanceira) {
        this.numero = numero;
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public InstituicaoFinanceira getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agencia)) return false;
        Agencia agencia = (Agencia) o;
        return getId().equals(agencia.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
