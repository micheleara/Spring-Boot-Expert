package io.github.moliara.domain.domain.repository;


import io.github.moliara.domain.domain.entity.Cliente;
import io.github.moliara.domain.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
