package io.github.moliara.domain.domain.repository;

import io.github.moliara.domain.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
