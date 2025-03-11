package com;

import com.luamapper.LuaMapper1;
import lua.xgwd.me.core.mapper.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author gbl.huang
 * @date 2025/03/11 14:52
 **/
@SpringBootApplication
public class Sp {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Sp.class, args);
        LuaMapper1 bean = run.getBean(LuaMapper1.class);
        System.out.println(bean.luaScpt(new String[]{"k1", "k2"}, new String[]{"v1", "v2"}));

    }
}