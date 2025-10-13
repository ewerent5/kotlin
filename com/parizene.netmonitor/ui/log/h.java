package com.parizene.netmonitor.ui.log;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.h0;
import com.parizene.netmonitor.ui.b1;
import com.parizene.netmonitor.ui.f1;
import com.parizene.netmonitor.ui.p0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: LogItemViewBinder.java */
/* loaded from: classes3.dex */
public class h implements b1<g, LogItemViewHolder> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13886b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13887c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13888d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f13889e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13890f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13891g;

    /* renamed from: h, reason: collision with root package name */
    private final i f13892h;

    /* renamed from: i, reason: collision with root package name */
    private q f13893i;

    /* renamed from: j, reason: collision with root package name */
    private final f.a<com.parizene.netmonitor.m0.z.b> f13894j;

    /* renamed from: k, reason: collision with root package name */
    private final Calendar f13895k = Calendar.getInstance();

    /* renamed from: l, reason: collision with root package name */
    private final SimpleDateFormat f13896l;

    /* renamed from: m, reason: collision with root package name */
    private final SimpleDateFormat f13897m;
    private final SparseArray<Drawable> n;
    private final SparseArray<Drawable> o;
    private final SparseArray<Drawable> p;

    public h(Context context, i iVar, q qVar, f.a<com.parizene.netmonitor.m0.z.b> aVar) throws Resources.NotFoundException {
        this.f13892h = iVar;
        this.f13893i = qVar;
        this.f13894j = aVar;
        Locale locale = Locale.getDefault();
        this.f13896l = new SimpleDateFormat("dd.MM.yyyy HH:mm", locale);
        this.f13897m = new SimpleDateFormat("HH:mm", locale);
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.yellow_600);
        this.a = color;
        int color2 = resources.getColor(R.color.light_green_500);
        this.f13886b = color2;
        int color3 = resources.getColor(R.color.red_500);
        this.f13887c = color3;
        int color4 = resources.getColor(R.color.blue_500);
        this.f13888d = color4;
        int[] iArr = {color, color2};
        this.f13889e = iArr;
        this.n = e(resources, iArr, R.drawable.ic_log_item_was_current);
        int[] iArr2 = {color4, color2, color, color3};
        this.f13890f = iArr2;
        this.o = e(resources, iArr2, R.drawable.ic_log_item_location_src);
        int[] iArr3 = {color2, color, color3};
        this.f13891g = iArr3;
        this.p = e(resources, iArr3, R.drawable.ic_log_item_info_src);
    }

    private static SparseArray<Drawable> e(Resources resources, int[] iArr, int i2) {
        SparseArray<Drawable> sparseArray = new SparseArray<>();
        for (int i3 : iArr) {
            sparseArray.put(i3, h0.a(resources.getDrawable(i2), i3, false));
        }
        return sparseArray;
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(g gVar, LogItemViewHolder logItemViewHolder) {
        logItemViewHolder.N(gVar);
        logItemViewHolder.wasCurrentView.setImageDrawable(this.n.get(gVar.n() ? this.f13886b : this.a));
        logItemViewHolder.lacNidView.setText(String.valueOf(gVar.f()));
        logItemViewHolder.cidBidView.setText(p0.a(gVar.b(), gVar.k(), this.f13893i.a(), this.f13893i.c()));
        if (gVar.m() != 0) {
            logItemViewHolder.rncView.setVisibility(0);
            logItemViewHolder.rncView.setText(String.valueOf(gVar.m()));
        } else {
            logItemViewHolder.rncView.setVisibility(8);
        }
        if (gVar.l() != -1) {
            logItemViewHolder.pscView.setVisibility(0);
            logItemViewHolder.pscView.setText(String.valueOf(gVar.l()));
        } else {
            logItemViewHolder.pscView.setVisibility(8);
        }
        String strB = f1.b(this.f13894j.get(), gVar.k(), gVar.a(), gVar.i());
        if (TextUtils.isEmpty(strB)) {
            logItemViewHolder.networkTypeAndChannelView.setVisibility(8);
        } else {
            logItemViewHolder.networkTypeAndChannelView.setVisibility(0);
            logItemViewHolder.networkTypeAndChannelView.setText(strB);
        }
        if (this.f13893i.d()) {
            logItemViewHolder.operatorView.setVisibility(0);
            logItemViewHolder.operatorView.setText(gVar.i() + " " + gVar.j());
        } else {
            logItemViewHolder.operatorView.setVisibility(8);
        }
        logItemViewHolder.locationSrcView.setImageDrawable(this.o.get(gVar.h() == 1 ? this.f13886b : gVar.h() == 2 ? this.f13888d : gVar.h() == 3 ? this.a : this.f13887c));
        logItemViewHolder.infoSrcView.setImageDrawable(this.p.get(gVar.e() == 1 ? this.f13886b : gVar.e() == 3 ? this.a : this.f13887c));
        this.f13895k.setTimeInMillis(gVar.g());
        logItemViewHolder.lastMentionedView.setText((this.f13893i.b() ? this.f13896l : this.f13897m).format(this.f13895k.getTime()));
        logItemViewHolder.cellInfoView.setText(gVar.d());
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public LogItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new LogItemViewHolder(layoutInflater.inflate(R.layout.list_item_log, viewGroup, false), this.f13892h);
    }

    public void f(q qVar) {
        this.f13893i = qVar;
    }
}