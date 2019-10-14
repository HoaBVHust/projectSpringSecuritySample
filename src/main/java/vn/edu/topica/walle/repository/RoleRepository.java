package vn.edu.topica.walle.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.topica.walle.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}
