package io.github.moliara.domain.domain.repository;

import io.github.moliara.domain.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}

