package org.launchcode.happycamper.controllers.models.data;

import org.launchcode.happycamper.controllers.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

    public User findByEmail(String email);

    public List<User> findByUsername(String username);
}
