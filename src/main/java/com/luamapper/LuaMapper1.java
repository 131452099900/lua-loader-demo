package com.luamapper;

import lua.xgwd.me.core.annotation.LuaMapper;
import lua.xgwd.me.core.annotation.LuaScript;

/**
 * @author gbl.huang
 * @date 2025/03/11 14:53
 **/
@LuaMapper
public interface LuaMapper1 {


    @LuaScript("test.lua")
    Long luaScpt(String[] keys, String[] args);
}