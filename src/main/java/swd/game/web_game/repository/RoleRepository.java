package swd.game.web_game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swd.game.web_game.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}
