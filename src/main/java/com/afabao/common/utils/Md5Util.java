package com.afabao.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Util {

    private static final Integer COUNT=10;

    public static String md5(String resource ,String salt){
        return new Md5Hash(resource ,salt ,COUNT).toString();
    }
}
