package org.example.edgeService.controller;

import org.example.edgeService.domain.Item;
import org.example.edgeService.repository.ItemClient;

import java.util.Collection;
import java.util.stream.Collectors;

public class GoodsItemAdaptorController {

    private ItemClient itemClient;

    public GoodsItemAdaptorController(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

        public Collection<Item> goodItems() {
            return itemClient.readItems()
                    .getContent().
        }
        private boolean isGreat(Item item) {
            return !item.getName().equals("Nike") &&
                    !item.getName().equals("Adidas") &&
                    !item.getName().equals("Reebok");
        }


}
