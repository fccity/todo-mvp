package com.binfenfuture.fccity.todomvp.lawyerlist;

import android.support.annotation.NonNull;
import android.util.Log;

import com.binfenfuture.fccity.todomvp.data.LawyerListBean;
import com.binfenfuture.fccity.todomvp.data.LawyerListDataSource;
import com.binfenfuture.fccity.todomvp.data.LawyerListRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListPresenter implements LawyerListContract.Presenter {

    @NonNull
    private final LawyerListRepository mLawyerListRepository;

    @NonNull
    private final LawyerListContract.View mLawyerListView;

    private List<LawyerListBean> mLawyerList = new ArrayList<>();

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
                mLawyerList = beanList;
                mLawyerListView.showLayerList(beanList);
            }

            @Override
            public void loadDataFailure() {
                mLawyerListView.dismissLawyerList();
            }
        });
    }

    @Override
    public void refresh(String name, String changeDescription) {
    }

    @Override
    public List<LawyerListBean> getLawyerList(String lawyerSkill, String lawyerCity, String sortMethod) {
        return mLawyerList;
    }
}
