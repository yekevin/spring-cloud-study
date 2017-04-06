package me.kevin.cloud.repository;

import me.kevin.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin
 * @description
 * @date 2017/4/6
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
