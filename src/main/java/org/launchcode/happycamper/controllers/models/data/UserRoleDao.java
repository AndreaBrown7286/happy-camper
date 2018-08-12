package org.launchcode.happycamper.controllers.models.data;

import org.launchcode.happycamper.controllers.models.UserRole;
import org.springframework.context.annotation.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDao extends CrudRepository<UserRole, Integer> {
    Role findByRole(String roleName);
}
