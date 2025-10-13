package com.parizene.netmonitor.ui;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes3.dex */
public class TimestampRangeView {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private Time f13757b = new Time();

    /* renamed from: c, reason: collision with root package name */
    private Time f13758c = new Time();

    @BindView
    Button mEndDateButton;

    @BindView
    Button mEndTimeButton;

    @BindView
    Button mStartDateButton;

    @BindView
    Button mStartTimeButton;

    private class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        private Time f13759e;

        public a(Time time) {
            this.f13759e = time;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = TimestampRangeView.this.a;
            b bVar = TimestampRangeView.this.new b(view);
            Time time = this.f13759e;
            DatePickerDialog datePickerDialog = new DatePickerDialog(context, bVar, time.year, time.month, time.monthDay);
            datePickerDialog.setCanceledOnTouchOutside(true);
            datePickerDialog.show();
        }
    }

    private class b implements DatePickerDialog.OnDateSetListener {
        View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
            long jNormalize;
            long jNormalize2;
            Time time = TimestampRangeView.this.f13757b;
            Time time2 = TimestampRangeView.this.f13758c;
            if (this.a == TimestampRangeView.this.mStartDateButton) {
                jNormalize2 = time2.normalize(true);
                time.year = i2;
                time.month = i3;
                time.monthDay = i4;
                jNormalize = time.normalize(true);
                if (time.after(time2)) {
                    time2.set(time);
                    jNormalize2 = jNormalize;
                }
            } else {
                long millis = time.toMillis(true);
                time2.year = i2;
                time2.month = i3;
                time2.monthDay = i4;
                jNormalize = time2.normalize(true);
                if (time2.before(time)) {
                    time.set(time2);
                    jNormalize2 = jNormalize;
                } else {
                    jNormalize = millis;
                    jNormalize2 = jNormalize;
                }
            }
            TimestampRangeView timestampRangeView = TimestampRangeView.this;
            timestampRangeView.h(timestampRangeView.mStartDateButton, jNormalize);
            TimestampRangeView timestampRangeView2 = TimestampRangeView.this;
            timestampRangeView2.h(timestampRangeView2.mEndDateButton, jNormalize2);
        }
    }

    private class c implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        private Time f13762e;

        public c(Time time) {
            this.f13762e = time;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = TimestampRangeView.this.a;
            d dVar = TimestampRangeView.this.new d(view);
            Time time = this.f13762e;
            TimePickerDialog timePickerDialog = new TimePickerDialog(context, dVar, time.hour, time.minute, true);
            timePickerDialog.setCanceledOnTouchOutside(true);
            timePickerDialog.show();
        }
    }

    private class d implements TimePickerDialog.OnTimeSetListener {
        private View a;

        public d(View view) {
            this.a = view;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i2, int i3) {
            long jNormalize;
            long jNormalize2;
            Time time = TimestampRangeView.this.f13757b;
            Time time2 = TimestampRangeView.this.f13758c;
            if (this.a == TimestampRangeView.this.mStartTimeButton) {
                jNormalize2 = time2.normalize(true);
                time.hour = i2;
                time.minute = i3;
                jNormalize = time.normalize(true);
                if (time.after(time2)) {
                    time2.set(time);
                    jNormalize2 = jNormalize;
                }
            } else {
                long millis = time.toMillis(true);
                time2.hour = i2;
                time2.minute = i3;
                jNormalize = time2.normalize(true);
                if (time2.before(time)) {
                    time.set(time2);
                    jNormalize2 = jNormalize;
                } else {
                    jNormalize = millis;
                    jNormalize2 = jNormalize;
                }
            }
            TimestampRangeView timestampRangeView = TimestampRangeView.this;
            timestampRangeView.j(timestampRangeView.mStartTimeButton, jNormalize);
            TimestampRangeView timestampRangeView2 = TimestampRangeView.this;
            timestampRangeView2.j(timestampRangeView2.mEndTimeButton, jNormalize2);
        }
    }

    public TimestampRangeView(Context context, View view) throws NoSuchMethodException, SecurityException {
        this.a = context;
        ButterKnife.a(this, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(TextView textView, long j2) {
        textView.setText(DateUtils.formatDateTime(this.a, j2, 65556));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(TextView textView, long j2) {
        textView.setText(DateUtils.formatDateTime(this.a, j2, 129));
    }

    public long f() {
        return this.f13758c.toMillis(false);
    }

    public long g() {
        return this.f13757b.toMillis(false);
    }

    public void i(long j2, long j3) {
        this.f13757b.set(j2);
        this.f13758c.set(j3);
        h(this.mStartDateButton, j2);
        h(this.mEndDateButton, j3);
        j(this.mStartTimeButton, j2);
        j(this.mEndTimeButton, j3);
        this.mStartDateButton.setOnClickListener(new a(this.f13757b));
        this.mEndDateButton.setOnClickListener(new a(this.f13758c));
        this.mStartTimeButton.setOnClickListener(new c(this.f13757b));
        this.mEndTimeButton.setOnClickListener(new c(this.f13758c));
    }
}