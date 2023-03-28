package io.github.escudo7.msavaliadorcredito.application;

import io.github.escudo7.msavaliadorcredito.domain.model.CartaoCliente;
import io.github.escudo7.msavaliadorcredito.domain.model.DadosCliente;
import io.github.escudo7.msavaliadorcredito.domain.model.SituacaoCliente;
import io.github.escudo7.msavaliadorcredito.infra.clients.CartoesResourceCliente;
import io.github.escudo7.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clientesClient;
    private final CartoesResourceCliente cartoesClient;

    public SituacaoCliente obterSituacaoCliente(String cpf){
        ResponseEntity<DadosCliente> dadosClienteResponse = clientesClient.dadosCliente(cpf);
        ResponseEntity<List<CartaoCliente>> cartoesResponse = cartoesClient.getCartoesByCliente(cpf);

        return SituacaoCliente
                .builder()
                .cliente(dadosClienteResponse.getBody())
                .cartoes(cartoesResponse.getBody())
                .build();
    }
}
