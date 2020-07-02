package cn.edgar.security.repo;

import cn.edgar.security.domain.User;
import org.springframework.data.repository.CrudRepository;

// 数据库操作
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
