package org.example.itemCatalogService.repository;

import org.example.itemCatalogService.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
}
