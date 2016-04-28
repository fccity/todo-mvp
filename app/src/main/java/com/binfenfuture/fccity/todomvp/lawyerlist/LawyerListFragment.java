package com.binfenfuture.fccity.todomvp.lawyerlist;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import com.binfenfuture.fccity.todomvp.R;
import com.binfenfuture.fccity.todomvp.adapter.LawyerListAdapter;
import com.binfenfuture.fccity.todomvp.adapter.base.EfficientAdapter;
import com.binfenfuture.fccity.todomvp.data.LawyerListBean;

import java.util.List;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListFragment extends Fragment implements LawyerListContract.View {

    private LawyerListContract.Presenter mPresenter;
    private RecyclerView lawyerlistRv;
    private LawyerListAdapter lawyerListAdapter;
    private View mRoot;

    public static LawyerListFragment newInstance() {
        return new LawyerListFragment();
    }

    public LawyerListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.lawyerlist_frag, container, false);
        initView();

        return mRoot;
    }

    private void initView() {
        lawyerlistRv = (RecyclerView) mRoot.findViewById(R.id.lawyerlist_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        lawyerlistRv.setLayoutManager(linearLayoutManager);
        lawyerlistRv.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void setPresenter(LawyerListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showLayerList(List<LawyerListBean> lawyerListBeans) {
        Log.e("wqc", "showLayerList");
        initLawyerRecyclerView(lawyerListBeans);
    }

    public void initLawyerRecyclerView(List<LawyerListBean> lawyerListBeans) {
        lawyerListAdapter = new LawyerListAdapter(lawyerListBeans);
        lawyerListAdapter.setOnItemClickListener(new EfficientAdapter.OnItemClickListener<LawyerListBean>() {
            @Override
            public void onItemClick(EfficientAdapter<LawyerListBean> adapter, View view, LawyerListBean object, int position) {

            }

        });
        lawyerlistRv.setAdapter(lawyerListAdapter);

    }
}
