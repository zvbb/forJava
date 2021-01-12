package com.chapter3;

import com.utils.current.UnSafe;

/**
 * ******************************
 * author：      张志聪
 * createTime:   2021/1/6 23:36
 * description:
 * version:      V1.0
 * ******************************
 */
public class UnSafeDeploy {
    public Holder holder;

    @UnSafe
    public Holder getHolder() {
        if (holder == null) {
            //即使对象的引用对线程可用，但不代表对象的状态也是正确的
            holder = new Holder(11);
        }
        return holder;
    }

}

class Holder {
    private int n;

    public Holder(int n) {
        this.n = n;
    }

    //判断 一致性
    public void assertNormal() {
        if (n != n) {
            throw new AssertionError("一致性错误");
        }
    }
}
