package br.com.challenge.sistematransacoes.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "transacoes")
public class Transacao implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private InstituicaoFinanceira bancoOrigem;
    private String agenciaOrigem;
    private String contaOrigem;

    @ManyToOne
    private InstituicaoFinanceira bancoDestino;
    private String agenciaDestino;
    private String contaDestino;

    private BigDecimal valorTransacao;
    private LocalDateTime dataTransacao;
    private LocalDateTime dataImportacao = LocalDateTime.now();

    public Transacao() {
    }

    public Transacao(InstituicaoFinanceira bancoOrigem, String agenciaOrigem,
                     String contaOrigem, InstituicaoFinanceira bancoDestino,
                     String agenciaDestino, String contaDestino,
                     BigDecimal valorTransacao, LocalDateTime dataTransacao) {
        this.bancoOrigem = bancoOrigem;
        this.agenciaOrigem = agenciaOrigem;
        this.contaOrigem = contaOrigem;
        this.bancoDestino = bancoDestino;
        this.agenciaDestino = agenciaDestino;
        this.contaDestino = contaDestino;
        this.valorTransacao = valorTransacao;
        this.dataTransacao = dataTransacao;
    }

    public Long getId() {
        return id;
    }

    public InstituicaoFinanceira getBancoOrigem() {
        return bancoOrigem;
    }

    public String getAgenciaOrigem() {
        return agenciaOrigem;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public InstituicaoFinanceira getBancoDestino() {
        return bancoDestino;
    }

    public String getAgenciaDestino() {
        return agenciaDestino;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public BigDecimal getValorTransacao() {
        return valorTransacao;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public LocalDateTime getDataImportacao() {
        return dataImportacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transacao)) return false;
        Transacao transacao = (Transacao) o;
        return getId().equals(transacao.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
