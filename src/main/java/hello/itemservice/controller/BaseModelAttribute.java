package hello.itemservice.controller;

import hello.itemservice.domain.item.DeliveryCode;
import hello.itemservice.domain.item.ItemType;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BaseModelAttribute {

    @ModelAttribute("regions")
    public Map<String, String> regions() {

        Map<String, String> regions = new LinkedHashMap<>();
        regions.put("SEOUL", "서울");
        regions.put("BUSAN", "부산");
        regions.put("JEJU", "제주도");

        return regions;
    }

    @ModelAttribute("itemTypes")
    public ItemType[] itemTypes() {

        return ItemType.values();
    }

    @ModelAttribute("deliveryCodes")
    public List<DeliveryCode> deliveryCodes() {

        List<DeliveryCode> deliveryCodes = new ArrayList<>();

        deliveryCodes.add(new DeliveryCode("FAST", "빠른 배송"));
        deliveryCodes.add(new DeliveryCode("NORMAL", "일반 배송"));
        deliveryCodes.add(new DeliveryCode("SLOW", "느린 배송"));

        return deliveryCodes;
    }
}
