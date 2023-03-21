package oi.github.escudo7.mscartoes.application;

import lombok.RequiredArgsConstructor;
import oi.github.escudo7.mscartoes.domain.ClienteCartao;
import oi.github.escudo7.mscartoes.infra.repository.ClienteCartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {
    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
