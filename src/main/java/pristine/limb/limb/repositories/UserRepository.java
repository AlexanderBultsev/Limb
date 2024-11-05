package pristine.limb.limb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pristine.limb.limb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
