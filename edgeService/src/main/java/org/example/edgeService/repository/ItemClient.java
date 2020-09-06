package org.example.edgeService.repository;


import com.google.common.io.Resources;
import org.example.edgeService.domain.Item;
import org.springframework.hateoas.EntityModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("item-catalog-service")
public interface ItemClient {

    @GetMapping("/items")
    EntityModel<Item> readItems();

}
