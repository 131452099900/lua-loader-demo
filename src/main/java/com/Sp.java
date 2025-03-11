package com;

import com.luamapper.LuaMapper1;
import lua.xgwd.me.core.LuaMapperFactory;
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
        // 通过直接获取接口代理注入
        LuaMapper1 luaMapper1 = run.getBean(LuaMapper1.class);
        System.out.println(luaMapper1.luaScpt(new String[]{"k1", "k2"}, new String[]{"v1", "v2"}));

        // 通过工厂注入
        LuaMapperFactory luaMapperFactory = run.getBean(LuaMapperFactory.class);
        LuaMapper1 mapper = luaMapperFactory.getMapper(LuaMapper1.class);
        Long aLong = mapper.luaScpt(new String[]{"k1", "k2"}, new String[]{"v1", "v2"});
    }
}