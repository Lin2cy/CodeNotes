package com.itmuch.cloud.microservicesimpleprovieruser.dao;

import com.itmuch.cloud.microservicesimpleprovieruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: dao
 * @author: lin2cy
 * @createTime: 2018/5/8 11:35
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
