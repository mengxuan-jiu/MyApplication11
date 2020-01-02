package com.bawei.myapplication.contract;
import com.bawei.myapplication.presenter.bean.Bean;
/**
 * @包名 com.bawei.mengxuan.contract
 * @mengxuan
 * @日期2019/12/31
 * @日期2019 : 12:31
 * @项目名mengxuan20191231
 * @类名IHomecontract
 **/
public interface IHomecontract {
    interface IView{
        //失败
        void success(Bean bean);
        void failure(Throwable throwable);
    }

    interface IPresenter{
        void getDaee();
    }

    interface IModel{
        void getDaee(ImView imView);
        interface ImView{
            //失败
            void success(Bean bean);
            void failure(Throwable throwable);
        }
    }
}
