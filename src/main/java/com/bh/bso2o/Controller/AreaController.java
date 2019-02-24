package com.bh.bso2o.Controller;

import com.bh.bso2o.Service.AreaService;
import com.bh.bso2o.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/getall")
    @ResponseBody
    public List<Area> getall() {
        return areaService.getall();
    }

    @RequestMapping("/getbyid/{id}")
    @ResponseBody
    public Area getbyid(@PathVariable(value = "id") Integer id) {
        if (id==null || "".equals(id)){
            return null;
        }
        return areaService.getbyid(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Area createArea(Area area) {
        System.out.println("执行了");
        area.setCreateTime(new Date());
        area.setLastTime(new Date());
        return areaService.createArea(area);
    }
}
