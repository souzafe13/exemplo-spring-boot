package br.senac.tads.dsw.exemplo_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @GetMapping("/ping")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String testarConexao() {
        return "API de usuários está online e funcionando!!!";
    }
}
