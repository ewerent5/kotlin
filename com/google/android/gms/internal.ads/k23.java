package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class k23 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6930b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6931c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6932d;

    /* renamed from: e, reason: collision with root package name */
    private final a33 f6933e;

    /* renamed from: f, reason: collision with root package name */
    private final i33 f6934f;
    private int n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f6935g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<String> f6936h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList<String> f6937i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList<w23> f6938j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f6939k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f6940l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f6941m = 0;
    private String o = "";
    private String p = "";
    private String q = "";

    public k23(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.a = i2;
        this.f6930b = i3;
        this.f6931c = i4;
        this.f6932d = z;
        this.f6933e = new a33(i5);
        this.f6934f = new i33(i6, i7, i8);
    }

    private final void p(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str == null || str.length() < this.f6931c) {
            return;
        }
        synchronized (this.f6935g) {
            this.f6936h.add(str);
            this.f6939k += str.length();
            if (z) {
                this.f6937i.add(str);
                this.f6938j.add(new w23(f2, f3, f4, f5, this.f6937i.size() - 1));
            }
        }
    }

    private static final String q(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            sb.append(arrayList.get(i3));
            sb.append(' ');
            i3++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f6935g) {
            z = this.f6941m == 0;
        }
        return z;
    }

    public final String b() {
        return this.o;
    }

    public final String c() {
        return this.p;
    }

    public final String d() {
        return this.q;
    }

    public final void e() {
        synchronized (this.f6935g) {
            this.n -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k23)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((k23) obj).o;
        return str != null && str.equals(this.o);
    }

    public final void f() {
        synchronized (this.f6935g) {
            this.f6941m--;
        }
    }

    public final void g() {
        synchronized (this.f6935g) {
            this.f6941m++;
        }
    }

    public final void h(String str, boolean z, float f2, float f3, float f4, float f5) {
        p(str, z, f2, f3, f4, f5);
        synchronized (this.f6935g) {
            if (this.f6941m < 0) {
                er.zzd("ActivityContent: negative number of WebViews.");
            }
            k();
        }
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final void i(String str, boolean z, float f2, float f3, float f4, float f5) {
        p(str, z, f2, f3, f4, f5);
    }

    public final void j() {
        synchronized (this.f6935g) {
            int iL = l(this.f6939k, this.f6940l);
            if (iL > this.n) {
                this.n = iL;
            }
        }
    }

    public final void k() {
        synchronized (this.f6935g) {
            int iL = l(this.f6939k, this.f6940l);
            if (iL > this.n) {
                this.n = iL;
                if (!zzs.zzg().l().zzd()) {
                    this.o = this.f6933e.a(this.f6936h);
                    this.p = this.f6933e.a(this.f6937i);
                }
                if (!zzs.zzg().l().zzh()) {
                    this.q = this.f6934f.a(this.f6937i, this.f6938j);
                }
            }
        }
    }

    final int l(int i2, int i3) {
        return this.f6932d ? this.f6930b : (i2 * this.a) + (i3 * this.f6930b);
    }

    public final int m() {
        return this.n;
    }

    public final void n(int i2) {
        this.f6940l = i2;
    }

    final int o() {
        return this.f6939k;
    }

    public final String toString() {
        int i2 = this.f6940l;
        int i3 = this.n;
        int i4 = this.f6939k;
        String strQ = q(this.f6936h, 100);
        String strQ2 = q(this.f6937i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        int length = String.valueOf(strQ).length();
        int length2 = String.valueOf(strQ2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(strQ);
        sb.append("\n viewableText");
        sb.append(strQ2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}