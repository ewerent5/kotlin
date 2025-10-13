package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vb1 implements ah1<xb1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9680b;

    /* renamed from: c, reason: collision with root package name */
    private final qp1 f9681c;

    /* renamed from: d, reason: collision with root package name */
    private final View f9682d;

    public vb1(h52 h52Var, Context context, qp1 qp1Var, ViewGroup viewGroup) {
        this.a = h52Var;
        this.f9680b = context;
        this.f9681c = qp1Var;
        this.f9682d = viewGroup;
    }

    final /* synthetic */ xb1 a() {
        Context context = this.f9680b;
        r93 r93Var = this.f9681c.f8428e;
        ArrayList arrayList = new ArrayList();
        View view = this.f9682d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new xb1(context, r93Var, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<xb1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ub1
            private final vb1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}