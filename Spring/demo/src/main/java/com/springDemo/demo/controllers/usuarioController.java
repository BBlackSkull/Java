package com.springDemo.demo.controllers;

import com.springDemo.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class usuarioController {
@RequestMapping(value = "usuario/{id}" )
    public Usuario getUsuario(@PathVariable Long id) {
    Usuario usuario = new Usuario();
    usuario.setId(id);
    usuario.setNombre("Yamall");
    usuario.setApellido("Avalos");
    usuario.setNumero("+59899666333");
    usuario.setEmail("yamalls@example.com");
    usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuario1" )
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Yamall");
        usuario.setApellido("Avalos");
        usuario.setNumero("+59899666333");
        usuario.setEmail("yamalls@example.com");
        usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuario3" )
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Yamall");
        usuario.setApellido("Avalos");
        usuario.setNumero("+59899666333");
        usuario.setEmail("yamalls@example.com");
        usuario.setPassword("123456");

        return usuario;
    }

    @RequestMapping(value = "usuario2" )
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Yamall");
        usuario.setApellido("Avalos");
        usuario.setNumero("+59899666333");
        usuario.setEmail("yamalls@example.com");
        usuario.setPassword("123456");

        return usuario;
    }
}
