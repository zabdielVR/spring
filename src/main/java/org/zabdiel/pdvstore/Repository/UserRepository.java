package org.zabdiel.pdvstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zabdiel.pdvstore.Entity.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios,Long> {
    //Se deifne el metodo findByUsername retorna un objeto usuario
    Usuarios findByUsername(String username);
}
