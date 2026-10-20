package br.com.fiap.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotations --anotações
@RestController  // indicar que é um controlador da apiRest
@RequestMapping("/hello") // qual end point acessar
public class HelloController {

    @GetMapping
    public String hello() {
        return "<h1> Hello World! </h1>";
    }
}
