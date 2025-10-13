package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class i {

    /* compiled from: NotificationCompat.java */
    public static class a {
        final Bundle a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f843b;

        /* renamed from: c, reason: collision with root package name */
        private final m[] f844c;

        /* renamed from: d, reason: collision with root package name */
        private final m[] f845d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f846e;

        /* renamed from: f, reason: collision with root package name */
        boolean f847f;

        /* renamed from: g, reason: collision with root package name */
        private final int f848g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f849h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f850i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f851j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f852k;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.b(null, "", i2) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f852k;
        }

        public boolean b() {
            return this.f846e;
        }

        public m[] c() {
            return this.f845d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i2;
            if (this.f843b == null && (i2 = this.f850i) != 0) {
                this.f843b = IconCompat.b(null, "", i2);
            }
            return this.f843b;
        }

        public m[] f() {
            return this.f844c;
        }

        public int g() {
            return this.f848g;
        }

        public boolean h() {
            return this.f847f;
        }

        public CharSequence i() {
            return this.f851j;
        }

        public boolean j() {
            return this.f849h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, m[] mVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f847f = true;
            this.f843b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f850i = iconCompat.c();
            }
            this.f851j = d.d(charSequence);
            this.f852k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.f844c = mVarArr;
            this.f845d = mVarArr2;
            this.f846e = z;
            this.f848g = i2;
            this.f847f = z2;
            this.f849h = z3;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f853e;

        @Override // androidx.core.app.i.e
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f866b).bigText(this.f853e);
                if (this.f868d) {
                    bigTextStyleBigText.setSummaryText(this.f867c);
                }
            }
        }

        public b g(CharSequence charSequence) {
            this.f853e = d.d(charSequence);
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f867c = d.d(charSequence);
            this.f868d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            if (cVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            throw null;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static abstract class e {
        protected d a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f866b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f867c;

        /* renamed from: d, reason: collision with root package name */
        boolean f868d = false;

        public void a(Bundle bundle) {
        }

        public abstract void b(h hVar);

        public RemoteViews c(h hVar) {
            return null;
        }

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public void f(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.r(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return k.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        boolean N;
        c O;
        Notification P;
        boolean Q;

        @Deprecated
        public ArrayList<String> R;
        public Context a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f854b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<a> f855c;

        /* renamed from: d, reason: collision with root package name */
        CharSequence f856d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f857e;

        /* renamed from: f, reason: collision with root package name */
        PendingIntent f858f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f859g;

        /* renamed from: h, reason: collision with root package name */
        RemoteViews f860h;

        /* renamed from: i, reason: collision with root package name */
        Bitmap f861i;

        /* renamed from: j, reason: collision with root package name */
        CharSequence f862j;

        /* renamed from: k, reason: collision with root package name */
        int f863k;

        /* renamed from: l, reason: collision with root package name */
        int f864l;

        /* renamed from: m, reason: collision with root package name */
        boolean f865m;
        boolean n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        public d(Context context, String str) {
            this.f854b = new ArrayList<>();
            this.f855c = new ArrayList<>();
            this.f865m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.P = notification;
            this.a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.P.audioStreamType = -1;
            this.f864l = 0;
            this.R = new ArrayList<>();
            this.N = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void l(int i2, boolean z) {
            if (z) {
                Notification notification = this.P;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.P;
                notification2.flags = (~i2) & notification2.flags;
            }
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f854b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new j(this).c();
        }

        public Bundle c() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d e(boolean z) {
            l(16, z);
            return this;
        }

        public d f(String str) {
            this.I = str;
            return this;
        }

        public d g(CharSequence charSequence) {
            this.f862j = d(charSequence);
            return this;
        }

        public d h(PendingIntent pendingIntent) {
            this.f858f = pendingIntent;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f857e = d(charSequence);
            return this;
        }

        public d j(CharSequence charSequence) {
            this.f856d = d(charSequence);
            return this;
        }

        public d k(PendingIntent pendingIntent) {
            this.P.deleteIntent = pendingIntent;
            return this;
        }

        public d m(boolean z) {
            this.x = z;
            return this;
        }

        public d n(boolean z) {
            l(2, z);
            return this;
        }

        public d o(int i2) {
            this.f864l = i2;
            return this;
        }

        public d p(int i2, int i3, boolean z) {
            this.r = i2;
            this.s = i3;
            this.t = z;
            return this;
        }

        public d q(int i2) {
            this.P.icon = i2;
            return this;
        }

        public d r(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (eVar != null) {
                    eVar.f(this);
                }
            }
            return this;
        }

        public d s(CharSequence charSequence) {
            this.P.tickerText = d(charSequence);
            return this;
        }

        public d t(long j2) {
            this.P.when = j2;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }
    }
}