package com.qfedu.baiyougou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.qfedu.baiyougou.dao")
public class BaiyougouApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaiyougouApplication.class, args);
    }

}
