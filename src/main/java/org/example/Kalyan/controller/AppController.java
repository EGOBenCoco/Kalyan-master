package org.example.Kalyan.controller;

import lombok.AllArgsConstructor;

import org.example.Kalyan.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AppController
{
private final UserService userService;


@PostMapping("/register/{name}/{number}/{email}/{password}/{isManager}")
public ResponseEntity editPersonalData(@PathVariable String name,
                                               @PathVariable int number,
                                               @PathVariable String email,
                                               @PathVariable String password,
                                               @PathVariable boolean isManager
                                    )  {
    try {
        userService.registerUser(name,number,email,password,isManager);
        return ResponseEntity.ok("Успішно змінено дані");
    } catch (Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}





}

/*TODO
* API для табака, кальяна (груд)
* API для orders (добавление новых заказов,несколько заказов/ изменение статуса заказа Enum (!!!)
* */