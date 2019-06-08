package com.shop.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    String id;
    String name;
    String price;
    Integer stoc;
    String type;


//    {
//        "id" : "1",
//        "name" : "ball"
//
//    }
}
