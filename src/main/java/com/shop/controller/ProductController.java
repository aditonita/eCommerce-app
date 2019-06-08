package com.shop.controller;

import com.shop.domain.model.ProductDTO;
import com.shop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/add-product")
    public String showProductPage(ModelMap model) {
        ProductDTO productDTO = ProductDTO.builder()
                                          .name("ball")
                                          .price("200")
                                          .type("sport")
                                          .stoc(50)
                                          .build();
        model.addAttribute("product", productDTO);
        return "product";
    }

    @PostMapping("/create-product")
    public String createProduct(ModelMap model, ProductDTO productDTO) {
        service.createProduct(productDTO);
        return "redirect:/list-products";
    }

    @GetMapping("/list-products")
    public String listAllProducts(ModelMap model) {
        String name = getLoggedInUserName(model);
        List<ProductDTO> allProducts = service.getAllProducts();
        model.put("products", allProducts);
        return "list-products";
    }

    private String getLoggedInUserName(ModelMap model) {
        Object principal = SecurityContextHolder.getContext()
                                                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }


}
