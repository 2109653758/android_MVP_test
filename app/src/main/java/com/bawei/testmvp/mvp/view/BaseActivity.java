package com.bawei.testmvp.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.testmvp.mvp.presenter.IPresenter;


/**
 * @ClassName: BaseActivity$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:24$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public abstract class BaseActivity <P extends IPresenter> extends AppCompatActivity implements IActivity,IView {

    public P mPresenter;

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 绑定页面
         */
        setContentView(BandLayout());
        /**
         * 初始化控件
         */
        initView();
        /**
         * 加载数据
         */
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!= null){
            mPresenter.OnDestroy();
            mPresenter = null;
        }
    }
}
