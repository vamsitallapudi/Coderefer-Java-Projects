package designPatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public final class Bakery {

    static List<Item> items = new ArrayList<>();

    public static final class Builder {

        public Builder() {}

        public Builder addItem(Item item) {
            items.add(item);
            return this;
        }

        public void build() {
            StringBuilder itemsBuilder = new StringBuilder();
            items.forEach(item -> itemsBuilder.append(item.name()).append(","));
            System.out.println("Items added: " + itemsBuilder.toString());
        }
    }
}
