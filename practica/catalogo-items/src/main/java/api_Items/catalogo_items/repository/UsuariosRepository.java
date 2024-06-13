package api_Items.catalogo_items.repository;


import api_Items.catalogo_items.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long>{
}
