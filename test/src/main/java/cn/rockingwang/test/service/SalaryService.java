package cn.rockingwang.test.service;

import cn.rockingwang.framework.spring.beans.Bean;

@Bean
public class SalaryService {

    public Integer calSalary(Integer experience) {
        return experience * 5000;
    }

}
