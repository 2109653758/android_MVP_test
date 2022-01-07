package com.bawei.testmvp.mvp.view;

import androidx.annotation.LayoutRes;

/**
 * @ClassName: IActivity$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:18$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public interface IActivity {
    /**
     * 页面绑定
     * @return
     */
    @LayoutRes
    int BandLayout();

    /**
     * 初始化控件
     */
    void initView();

    /**
     * 加载数据
     */
    void initData();

}
