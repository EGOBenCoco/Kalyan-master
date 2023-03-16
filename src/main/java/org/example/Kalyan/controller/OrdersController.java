package org.example.Kalyan.controller;

import lombok.AllArgsConstructor;
import org.example.Kalyan.service.OrdersService;
import org.example.Kalyan.transferModels.OrdersModels;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class OrdersController
{
    private final OrdersService ordersService;

    @PostMapping("/orders")
    public ResponseEntity ordersAdd(@RequestBody OrdersModels ordersModels)
    {
        try {
            ordersService.ordersAdd(ordersModels);
            return ResponseEntity.ok("Замовлення додано");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
