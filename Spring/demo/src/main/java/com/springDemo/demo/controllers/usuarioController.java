package com.springDemo.demo.controllers;

import com.springDemo.demo.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class usuarioController {
@RequestMapping(value = "usuario" )
    public Usuario getUsuario() {
    Usuario usuario = new Usuario();
    usuario.setNombre("Yamall");
    usuario.setApellido("Avalos");
    usuario.setEmail("yamalls@example.com");
    usuario.setPassword("123456");

        return usuario;
    }
}
