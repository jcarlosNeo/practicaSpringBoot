package api_Items.catalogo_items;

import api_Items.catalogo_items.model.Usuarios;
import api_Items.catalogo_items.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuarios createUser(Usuarios user){
        return usuariosRepository.save(user);
    }

    public Usuarios getUserById(Long id){
        Optional<Usuarios> optionalUser = usuariosRepository.findById(id);
        return  optionalUser.get();
    }

    public List<Usuarios> getAllUsers(){
        return usuariosRepository.findAll();
    }

    public void deleteUser(Long id){
        usuariosRepository.deleteById(id);
    }

}
