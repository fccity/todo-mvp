package com.binfenfuture.fccity.todomvp.lawyerlist;

import com.binfenfuture.fccity.todomvp.BasePresenter;
import com.binfenfuture.fccity.todomvp.BaseView;
import com.binfenfuture.fccity.todomvp.data.LawyerListBean;

import java.util.List;

/**
 * Created by fccity on 16/4/26.
 */
public interface LawyerListContract {

    interface View extends BaseView<Presenter> {
        void showLayerList(List<LawyerListBean> lawyerListBeans);

    }

    interface Presenter extends BasePresenter {
        void refresh(String name, String changeDescription);

        List<LawyerListBean> getLawyerList(String lawyerSkill, String lawyerCity, String sortMethod);
    }
}
