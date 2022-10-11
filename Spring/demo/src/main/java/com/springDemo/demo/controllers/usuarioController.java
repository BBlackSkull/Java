package com.springDemo.demo.controllers;

import com.springDemo.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "usuarios" )
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Yamall");
        usuario.setApellido("Avalos");
        usuario.setNumero("+59899666333");
        usuario.setEmail("yamalls@example.com");
        usuario.setPassword("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Facundo");
        usuario2.setApellido("Rodriguez");
        usuario2.setNumero("+59896558921");
        usuario2.setEmail("rf2022@example.com");
        usuario2.setPassword("123456");


        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Fagundez");
        usuario3.setNumero("+59894466223");
        usuario3.setEmail("fagugabriel@example.com");
        usuario3.setPassword("123456");


        Usuario usuario4 = new Usuario();
        usuario4.setId(4L);
        usuario4.setNombre("Fiorella");
        usuario4.setApellido("Santos");
        usuario4.setNumero("+59899789654");
        usuario4.setEmail("santosfio@example.com");
        usuario4.setPassword("123456");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
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
