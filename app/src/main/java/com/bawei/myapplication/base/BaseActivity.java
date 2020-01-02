package com.bawei.myapplication.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * @包名 com.bawei.mengxuan.base
 * @mengxuan
 * @日期2019/12/31
 * @日期2019 : 12:31
 * @项目名mengxuan20191231
 * @类名BaseActivity
 **/
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        mPresenter = protectedPresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        ButterKnife.bind(this);
        initView();
        initDate();
    }

    protected abstract int layoutId();

    protected abstract void initDate();

    protected abstract void initView();

    protected abstract P protectedPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.datach();
        if (mPresenter != null) {
            mPresenter.datach();
        }
    }
}
