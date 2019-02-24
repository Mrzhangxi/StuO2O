package com.bh.bso2o.Repository;

import com.bh.bso2o.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Integer> {

    List<Area> findAll();

    Area findByAreaId(int id);

}
