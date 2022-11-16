

package org.senai.prjdevjava.repository;

import org.senai.prjdevjava.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
}