package uk.gov.ons.oauthclientui.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductService {
    public Map<String, String> getProducts() {

        HashMap<String, String> h = new HashMap<>();

        h.put("Samsung 4k TV", "£1500");
        h.put("Apple Macbook Pro 13&quot/512GB/16GB", "£1750");
        h.put("Samsung Galaxy S9", "£799");
        h.put("iPhone X", "£899");
        h.put("Synology NAS", "£800");
        h.put("Jaguar F-Type, V8", "£89,000");
        h.put("Iiyama 4k Monitor", "£450");
        h.put("Pair of Jeans", "£49");
        h.put("Thinkpad", "£1500");
        h.put("Water Bottle", "£2");
        
        return h;
    }
}