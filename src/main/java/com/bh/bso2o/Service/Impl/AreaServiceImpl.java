package com.bh.bso2o.Service.Impl;

import com.bh.bso2o.Repository.AreaRepository;
import com.bh.bso2o.Service.AreaService;
import com.bh.bso2o.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> getall() {
        return areaRepository.findAll();
    }

    @Override
    public Area getbyid(int id) {
        return areaRepository.findByAreaId(id);
    }

    @Override
    public Area createArea(Area area) {
        return areaRepository.save(area);
    }
}
