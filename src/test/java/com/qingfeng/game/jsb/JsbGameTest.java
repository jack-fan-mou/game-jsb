package com.qingfeng.game.jsb;

import org.junit.Assert;
import org.junit.Test;


public class JsbGameTest {
    @Test
    public void hi() throws Exception {
        String name = "zhangsan";
        String expect = "Hi:" + name;
        String info = JsbGame.hi(name);
        Assert.assertEquals(info, expect);
    }

    @Test
    public void print() throws Exception {
        String name = "zhangsan";
        JsbGame game = new JsbGame();
        String info = game.print(name);
        Assert.assertEquals(info, name);
    }

}