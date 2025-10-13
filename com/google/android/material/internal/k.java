package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import c.h.l.b0;
import c.h.l.p;
import c.h.l.t;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class k {

    /* compiled from: ViewUtils.java */
    static class a implements p {
        final /* synthetic */ c a;

        /* renamed from: b */
        final /* synthetic */ d f11713b;

        a(c cVar, d dVar) {
            this.a = cVar;
            this.f11713b = dVar;
        }

        @Override // c.h.l.p
        public b0 a(View view, b0 b0Var) {
            return this.a.a(view, b0Var, new d(this.f11713b));
        }
    }

    /* compiled from: ViewUtils.java */
    static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            t.h0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    public interface c {
        b0 a(View view, b0 b0Var, d dVar);
    }

    public static void a(View view, c cVar) {
        t.w0(view, new a(cVar, new d(t.G(view), view.getPaddingTop(), t.F(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += t.w((View) parent);
        }
        return fW;
    }

    public static boolean d(View view) {
        return t.B(view) == 1;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void f(View view) {
        if (t.P(view)) {
            t.h0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* compiled from: ViewUtils.java */
    public static class d {
        public int a;

        /* renamed from: b */
        public int f11714b;

        /* renamed from: c */
        public int f11715c;

        /* renamed from: d */
        public int f11716d;

        public d(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f11714b = i3;
            this.f11715c = i4;
            this.f11716d = i5;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.f11714b = dVar.f11714b;
            this.f11715c = dVar.f11715c;
            this.f11716d = dVar.f11716d;
        }
    }
}