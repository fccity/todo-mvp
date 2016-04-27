package com.binfenfuture.fccity.todomvp.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.binfenfuture.fccity.todomvp.R;
import com.binfenfuture.fccity.todomvp.adapter.base.EfficientRecyclerAdapter;
import com.binfenfuture.fccity.todomvp.adapter.base.EfficientViewHolder;
import com.binfenfuture.fccity.todomvp.data.LawyerListBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by fccity on 16/3/3.
 */
public class LawyerListAdapter extends EfficientRecyclerAdapter<LawyerListBean> {

    public LawyerListAdapter(List<LawyerListBean> objects) {
        super(objects);
    }

    @Override
    public int getLayoutResId(int viewType) {
        return R.layout.lawyer_list_item;
    }

    @Override
    public Class<? extends EfficientViewHolder<? extends LawyerListBean>> getViewHolderClass(int viewType) {
        return LawyerViewHodler.class;
    }

    public class LawyerViewHodler extends EfficientViewHolder<LawyerListBean> {
        @Bind(R.id.lawyer_avata_img)
        SimpleDraweeView lawyerAvataImg;
        @Bind(R.id.lawyer_lawyer_name)
        TextView lawyerLawyerName;
        @Bind(R.id.lawyer_lawyer_area)
        TextView lawyerLawyerArea;
        @Bind(R.id.lawyer_prolife)
        TextView lawyerProlife;
        @Bind(R.id.lawyer_skill_text)
        TextView lawyerSkillText;
        @Bind(R.id.lawyer_credential)
        TextView lawyerCredential;

        public LawyerViewHodler(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void updateView(Context context, LawyerListBean object) {

            if (!TextUtils.isEmpty(object.getOutUrl().replace("\\", "")) && object.getOutUrl().replace("\\", "").length() > 6)
                lawyerAvataImg.setImageURI(Uri.parse(object.getOutUrl().replace("\\", "")));
            else lawyerAvataImg.setImageResource(R.mipmap.lawyer_head_default);

            lawyerProlife.setText(object.getLawyerProfessionalLife() + "年");
            lawyerSkillText.setText(object.getSkill1());
            lawyerLawyerArea.setText(object.getLawyerCity());
            lawyerCredential.setText(object.getLawyerCredential());
            lawyerLawyerName.setText(object.getLawyerName());

        }
    }

}
