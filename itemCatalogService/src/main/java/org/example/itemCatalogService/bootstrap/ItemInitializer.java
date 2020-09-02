package org.example.itemCatalogService.bootstrap;

import org.example.itemCatalogService.domain.Item;
import org.example.itemCatalogService.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
@Component
public class ItemInitializer implements CommandLineRunner {
    private ItemRepository itemRepository;

    public ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }
}
