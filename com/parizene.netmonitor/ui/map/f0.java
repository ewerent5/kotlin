package com.parizene.netmonitor.ui.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.parizene.netmonitor.R;

/* compiled from: IconGenerator.java */
/* loaded from: classes3.dex */
public class f0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f13939b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f13940c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f13941d;

    public f0(Context context) {
        this.a = context;
    }

    private void a() {
        if (this.f13939b == null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.view_marker, (ViewGroup) null);
            this.f13939b = viewGroup;
            viewGroup.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f13940c = (ImageView) this.f13939b.findViewById(R.id.icon);
            this.f13941d = (TextView) this.f13939b.findViewById(R.id.text);
        }
    }

    private ViewGroup b() {
        a();
        return this.f13939b;
    }

    private int c(int i2) {
        return i2 != 1 ? i2 != 2 ? R.drawable.cell_state_default : R.drawable.cell_state_neighboring : R.drawable.cell_state_current;
    }

    private int d(int i2) {
        return i2 != 1 ? i2 != 2 ? R.drawable.cell_state_default_bg : R.drawable.cell_state_neighboring_bg : R.drawable.cell_state_current_bg;
    }

    private Bitmap e() {
        ViewGroup viewGroupB = b();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        viewGroupB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = viewGroupB.getMeasuredWidth();
        int measuredHeight = viewGroupB.getMeasuredHeight();
        viewGroupB.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        viewGroupB.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public Bitmap f(String str) {
        a();
        TextView textView = this.f13941d;
        if (textView != null) {
            textView.setText(str);
        }
        return e();
    }

    public void g(int i2) {
        a();
        ImageView imageView = this.f13940c;
        if (imageView != null) {
            imageView.setImageResource(c(i2));
        }
        TextView textView = this.f13941d;
        if (textView != null) {
            textView.setBackgroundResource(d(i2));
        }
    }
}