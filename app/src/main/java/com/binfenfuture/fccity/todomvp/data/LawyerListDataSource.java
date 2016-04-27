package com.binfenfuture.fccity.todomvp.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by fccity on 16/4/26.
 */
public interface LawyerListDataSource {
    interface LoadLawyerListCallback {

        void loadDataSuccess(List<LawyerListBean> beanList);

        void loadDataFailure();
    }

    void getLawyerList(@NonNull LoadLawyerListCallback callback);

}
