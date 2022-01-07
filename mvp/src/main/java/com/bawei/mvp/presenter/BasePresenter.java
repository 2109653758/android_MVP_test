package com.bawei.mvp.presenter;

import com.bawei.mvp.model.IModel;
import com.bawei.mvp.view.IView;

/**
 * @ClassName: BasePresenter$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:20$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class BasePresenter <M extends IModel,V extends IView> implements IPresenter{

    public M mModel;
    public V mView;

    public BasePresenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
    }



    @Override
    public void OnDestroy() {

    }
}
