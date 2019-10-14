package vn.edu.topica.walle.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.topica.walle.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}