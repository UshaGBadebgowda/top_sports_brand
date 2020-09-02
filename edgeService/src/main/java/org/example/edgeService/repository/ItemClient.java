package org.example.edgeService.repository;


import org.example.edgeService.domain.Item;
import org.junit.jupiter.api.parallel.Resources;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("item-catalog-service")
public interface ItemClient {
    @GetMapping("/items")
    Resources<Item> readItems();
}
