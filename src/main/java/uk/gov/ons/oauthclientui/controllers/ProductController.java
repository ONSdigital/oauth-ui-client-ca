package uk.gov.ons.oauthclientui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.ons.oauthclientui.service.ProductService;

import java.security.Principal;
import java.util.Map;

@RestController
public class ProductController {

    private final ProductService products;

    @Autowired
    public ProductController(ProductService products) {
        this.products = products;
    }

    @RequestMapping("/products")
    public String products(Map<String, Object> model) {
        model.put("products", products);
        return "products";
    }

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
