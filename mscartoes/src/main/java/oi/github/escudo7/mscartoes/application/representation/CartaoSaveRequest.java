package oi.github.escudo7.mscartoes.application.representation;

import lombok.Data;
import oi.github.escudo7.mscartoes.domain.BandeiraCartao;
import oi.github.escudo7.mscartoes.domain.Cartao;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {
    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        return new Cartao(nome,bandeira, renda, limite);
    }
}
