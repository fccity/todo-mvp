package com.binfenfuture.fccity.todomvp.lawyerlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.binfenfuture.fccity.todomvp.R;
import com.binfenfuture.fccity.todomvp.data.LawyerListRepository;
import com.binfenfuture.fccity.todomvp.util.ActivityUtils;

/**
 * Created by fccity on 16/4/26.
 */
public class LawyerListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lawyerlist_act);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("律师列表");

        LawyerListFragment lawyerListFragment =
                (LawyerListFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if (lawyerListFragment == null) {
            lawyerListFragment = LawyerListFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    lawyerListFragment, R.id.contentFrame);
        }

        // Create the presenter
        new LawyerListPresenter(LawyerListRepository.getInstance(), lawyerListFragment);
    }

    /**
     * ActionBar back button
     *
     * @return
     */
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
