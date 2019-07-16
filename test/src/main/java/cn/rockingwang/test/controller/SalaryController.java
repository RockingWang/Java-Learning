package cn.rockingwang.test.controller;

import cn.rockingwang.framework.spring.beans.Autowire;
import cn.rockingwang.framework.spring.web.mvc.Controller;
import cn.rockingwang.framework.spring.web.mvc.RequestMapping;
import cn.rockingwang.framework.spring.web.mvc.RequestParam;
import cn.rockingwang.test.service.SalaryService;

@Controller
public class SalaryController {

    @Autowire
    private SalaryService salaryService;

    @RequestMapping("/get_salary.json")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience) {
        return salaryService.calSalary(Integer.parseInt(experience));
    }

}
