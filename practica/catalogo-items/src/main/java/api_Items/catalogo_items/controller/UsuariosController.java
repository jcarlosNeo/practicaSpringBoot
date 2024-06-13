package api_Items.catalogo_items.controller;

import api_Items.catalogo_items.model.Usuarios;
import api_Items.catalogo_items.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping
    public Usuarios createUser(@RequestBody Usuarios user){
        return usuariosService.createUser(user);
    }

    @GetMapping("/getUser")
    public List<Usuarios> getAllUsers(){
        return usuariosService.getAllUsers();
    }

    @GetMapping("/getUserByID/{id}")
    public Usuarios GetUserById(@PathVariable Long id){
        return usuariosService.getUserById(id);
    }

    @DeleteMapping("deleteUserByID/{id}")
    public void DeleteUserById(@PathVariable Long id){
        usuariosService.deleteUser(id);
    }
}
