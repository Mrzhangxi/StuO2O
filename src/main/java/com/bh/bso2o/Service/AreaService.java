package com.bh.bso2o.Service;

import com.bh.bso2o.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> getall();

    Area getbyid(int id);

    Area createArea(Area area);
}
