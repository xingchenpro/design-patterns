package com.hly.designPatterns.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/11
 */
public class WhiteKeyBoard extends AbstractKeyBoard {
    @Override
    public void color() {
        System.out.println("白色的键盘!");
    }
}
