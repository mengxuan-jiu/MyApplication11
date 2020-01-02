package com.bawei.myapplication.model;


import com.bawei.myapplication.contract.IHomecontract;
import com.bawei.myapplication.presenter.bean.Bean;
import com.bawei.myapplication.util.NetUtil;
import com.google.gson.Gson;

/**
 * @包名 com.bawei.mengxuan.model
 * @mengxuan
 * @日期2019/12/31
 * @日期2019 : 12:31
 * @项目名mengxuan20191231
 * @类名HomeModel
 **/
public class HomeModel implements IHomecontract.IModel {


    @Override
    public void getDaee(final ImView imView) {
        NetUtil.getInstance().getJson("http://blog.zhaoliang5156.cn/api/news/ranking.json", new NetUtil.IMyCback() {
            @Override
            public void doGetSering(String s) {
                Bean bean = new Gson().fromJson(s, Bean.class);
                imView.success(bean);
            }

            @Override
            public void doError(Throwable throwable) {
                imView.failure(throwable);
            }
        });
    }
}
