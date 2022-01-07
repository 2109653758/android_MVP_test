package com.bawei.testmvp.mvp.view;


/**
 * @ClassName: IView$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:17$
 * @UpdateRemark: 该接口为页面的显示
 * @Version: 1.0
 */
public interface IView {
    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 显示吐司
     */
    void showToast();

    /**
     * 显示隐藏
     */
    void hintLoading();
}
