package com.binfenfuture.fccity.todomvp.lawyerlist;

import android.support.annotation.NonNull;
import android.util.Log;

import com.binfenfuture.fccity.todomvp.data.LawyerListBean;
import com.binfenfuture.fccity.todomvp.data.LawyerListDataSource;
import com.binfenfuture.fccity.todomvp.data.LawyerListRepository;

import java.util.List;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListPresenter implements LawyerListContract.Presenter {

    @NonNull
    private final LawyerListRepository mLawyerListRepository;

    @NonNull
    private final LawyerListContract.View mLawyerListView;

    public LawyerListPresenter(@NonNull LawyerListRepository mLawyerListRepository,
                               @NonNull LawyerListContract.View mLawyerListView) {
        this.mLawyerListRepository = mLawyerListRepository;
        this.mLawyerListView = mLawyerListView;
        mLawyerListView.setPresenter(this);
    }

    @Override
    public void start() {
        mLawyerListRepository.getLawyerList(new LawyerListDataSource.LoadLawyerListCallback() {
            @Override
            public void loadDataSuccess(List<LawyerListBean> beanList) {
                Log.e("wqc", "loadSuccess");
                mLawyerListView.showLayerList(beanList);
            }

            @Override
            public void loadDataFailure() {

            }
        });
    }

    @Override
    public void changeLawyer(String name, String changeDescription) {

    }

    @Override
    public void getLawyerList(String lawyerSkill, String lawyerCity, String sortMethod) {

    }
}
