package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class Item {

    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;

    private boolean open;
    private List<String> regions;
    private ItemType itemType;
    private String deliveryCode;

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}