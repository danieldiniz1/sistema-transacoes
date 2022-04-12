package br.com.challenge.sistematransacoes.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "contas")
public class Conta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titular;
    private String numeroConta;
    @ManyToOne
    private Agencia agencia;

    public Conta() {
    }

    public Conta(String titular, String numeroConta, Agencia agencia) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public Long getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return getId().equals(conta.getId()) && getTitular().equals(conta.getTitular()) && getAgencia().equals(conta.getAgencia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitular(), getAgencia());
    }
}
