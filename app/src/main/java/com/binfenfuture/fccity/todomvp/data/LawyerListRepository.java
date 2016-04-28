package com.binfenfuture.fccity.todomvp.data;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListRepository implements LawyerListDataSource {
    private static LawyerListRepository INSTANCE;

    public static LawyerListRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LawyerListRepository();
        }
        return INSTANCE;
    }

    @Override
    public void getLawyerList(final @NonNull LoadLawyerListCallback callback) {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get("http://182.254.231.237/interface/getPersonalInfo.php?action=getAllLawyerInfo&lawyerSkill=不限&lawyerCity=不限&sortMethod=不限&pageNow=0", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Log.e("todomvp", "onsuccess :" + response);
                try {
                    Gson gson = new Gson();
                    List<LawyerListBean> temporaryList = new ArrayList<LawyerListBean>();
                    temporaryList = gson.fromJson(response.getString("data"), new TypeToken<List<LawyerListBean>>() {
                    }.getType());
                    callback.loadDataSuccess(temporaryList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                callback.loadDataFailure();
            }
        });
    }

    @Override
    public void getLawyerList(String page, @NonNull LoadLawyerListCallback callback) {

    }
}
