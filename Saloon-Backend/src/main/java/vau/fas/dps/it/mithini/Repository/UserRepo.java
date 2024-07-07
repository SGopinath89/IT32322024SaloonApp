package vau.fas.dps.it.mithini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vau.fas.dps.it.mithini.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}

