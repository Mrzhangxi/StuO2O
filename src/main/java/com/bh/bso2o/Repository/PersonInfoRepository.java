package com.bh.bso2o.Repository;

import com.bh.bso2o.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonInfoRepository extends JpaRepository<PersonInfo, Long> {

    List<PersonInfo> findAll();

    PersonInfo findByUserId(int userId);

    List<PersonInfo> findAllByEnableStatus(int enableStatus);

    List<PersonInfo> findAllByUserType(int usertype);

    PersonInfo findByName(String name);
//    PersonInfo deleteByUserId(int userId);

//    PersonInfo removeByUserId()
}
