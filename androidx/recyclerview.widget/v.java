package androidx.recyclerview.widget;

import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class v {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    a f1778b = new a();

    /* compiled from: ViewBoundsCheck.java */
    static class a {
        int a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f1779b;

        /* renamed from: c, reason: collision with root package name */
        int f1780c;

        /* renamed from: d, reason: collision with root package name */
        int f1781d;

        /* renamed from: e, reason: collision with root package name */
        int f1782e;

        a() {
        }

        void a(int i2) {
            this.a = i2 | this.a;
        }

        boolean b() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (c(this.f1781d, this.f1779b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & SyslogConstants.LOG_ALERT) != 0 && (i3 & (c(this.f1781d, this.f1780c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (c(this.f1782e, this.f1779b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            return (i5 & 28672) == 0 || (i5 & (c(this.f1782e, this.f1780c) << 12)) != 0;
        }

        int c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int i2, int i3, int i4, int i5) {
            this.f1779b = i2;
            this.f1780c = i3;
            this.f1781d = i4;
            this.f1782e = i5;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    interface b {
        View a(int i2);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.a = bVar;
    }

    View a(int i2, int i3, int i4, int i5) {
        int iC = this.a.c();
        int iD = this.a.d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewA = this.a.a(i2);
            this.f1778b.e(iC, iD, this.a.b(viewA), this.a.e(viewA));
            if (i4 != 0) {
                this.f1778b.d();
                this.f1778b.a(i4);
                if (this.f1778b.b()) {
                    return viewA;
                }
            }
            if (i5 != 0) {
                this.f1778b.d();
                this.f1778b.a(i5);
                if (this.f1778b.b()) {
                    view = viewA;
                }
            }
            i2 += i6;
        }
        return view;
    }

    boolean b(View view, int i2) {
        this.f1778b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (i2 == 0) {
            return false;
        }
        this.f1778b.d();
        this.f1778b.a(i2);
        return this.f1778b.b();
    }
}