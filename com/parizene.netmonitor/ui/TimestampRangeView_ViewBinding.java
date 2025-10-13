package com.parizene.netmonitor.ui;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class TimestampRangeView_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private TimestampRangeView f13765b;

    public TimestampRangeView_ViewBinding(TimestampRangeView timestampRangeView, View view) {
        this.f13765b = timestampRangeView;
        timestampRangeView.mStartDateButton = (Button) butterknife.b.a.c(view, R.id.start_date, "field 'mStartDateButton'", Button.class);
        timestampRangeView.mEndDateButton = (Button) butterknife.b.a.c(view, R.id.end_date, "field 'mEndDateButton'", Button.class);
        timestampRangeView.mStartTimeButton = (Button) butterknife.b.a.c(view, R.id.start_time, "field 'mStartTimeButton'", Button.class);
        timestampRangeView.mEndTimeButton = (Button) butterknife.b.a.c(view, R.id.end_time, "field 'mEndTimeButton'", Button.class);
    }
}