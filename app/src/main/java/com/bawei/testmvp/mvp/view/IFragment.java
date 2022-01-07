package com.bawei.testmvp.mvp.view;

import android.view.View;

import androidx.annotation.IdRes;

/**
 * @ClassName: IFragment$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/7$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:19$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public interface IFragment extends IActivity{
    /**
     * 控件初始化
     * @param id
     * @param <V>
     * @return
     */
    <V extends View> V findViewById(@IdRes int id);
}
