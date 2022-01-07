package com.bawei.testmvp.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.testmvp.mvp.presenter.IPresenter;


/**
 * @ClassName: BaseFragment$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:26$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public abstract class BaseFragment <P extends IPresenter> extends Fragment implements IFragment,IView {

    public P mPresenter;
    public View mView;

    /**
     * 绑定页面
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        return mView= inflater.inflate(BandLayout(),container, false);
    }

    /**
     * 初始化控件
     * @param id
     * @param <V>
     * @return
     */
    @Override
    public <V extends View> V findViewById(int id) {
        return mView.findViewById(id);
    }

    /**
     * 加载数据
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!= null){
            mPresenter.OnDestroy();
            mPresenter = null;
        }
    }
}
