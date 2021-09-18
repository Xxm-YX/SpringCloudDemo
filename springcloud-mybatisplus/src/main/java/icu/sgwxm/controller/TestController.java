package icu.sgwxm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import icu.sgwxm.entity.Table1Entity;
import icu.sgwxm.service.ITable1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ITable1Service table1Service;

    @RequestMapping("/test")
    public String getA(){
        return "success";
    }

    @RequestMapping("/list")
    public String getList(){
        return table1Service.list().toString();
    }

    // 分页查询
    @RequestMapping("listPage")
    public String getListPage(@RequestParam Integer page, @RequestParam Integer size) {
        IPage<Table1Entity> iPage = new Page<>(page, size);
        QueryWrapper<Table1Entity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Table1Entity::getTest1,"1");
        table1Service.page(iPage, queryWrapper);
        return iPage.getRecords().toString();
    }
}
