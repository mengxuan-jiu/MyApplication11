package com.bawei.myapplication.base;

/**
 * @包名 com.bawei.mengxuan.base
 * @mengxuan
 * @日期2019/12/31
 * @日期2019 : 12:31
 * @项目名mengxuan20191231
 * @类名BasePresenter
 **/
public abstract class BasePresenter<V> {
    protected V view;

    public BasePresenter() {
        initModel();
    }

    public void attach(V view) {
        this.view = view;
    }
    public void datach() {
        view=null;
    }

    protected abstract void initModel();
}
