package com.parizene.netmonitor.ui.log;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes3.dex */
class LogItemViewHolder extends RecyclerView.d0 implements View.OnClickListener {

    @BindView
    TextView cellInfoView;

    @BindView
    TextView cidBidView;

    @BindView
    ImageView infoSrcView;

    @BindView
    TextView lacNidView;

    @BindView
    TextView lastMentionedView;

    @BindView
    ImageView locationSrcView;

    @BindView
    TextView networkTypeAndChannelView;

    @BindView
    TextView operatorView;

    @BindView
    TextView pscView;

    @BindView
    TextView rncView;

    @BindView
    ImageView wasCurrentView;
    private i x;
    private g y;

    LogItemViewHolder(View view, i iVar) throws NoSuchMethodException, SecurityException {
        super(view);
        this.x = iVar;
        view.setOnClickListener(this);
        ButterKnife.a(this, view);
    }

    public void N(g gVar) {
        this.y = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.x.b0(this.y);
    }
}