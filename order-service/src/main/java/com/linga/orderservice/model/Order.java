package com.linga.orderservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "t_orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)   // used to let spring know that thi is one-to-many relationship
    private List<OrderLineItems> orderLineItemsList;
}
