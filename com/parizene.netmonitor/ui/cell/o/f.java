package com.parizene.netmonitor.ui.cell.o;

import android.text.TextUtils;
import com.parizene.netmonitor.m0.b0.y;
import java.util.Arrays;

/* compiled from: NetworkInfoItem.java */
/* loaded from: classes3.dex */
public class f {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f13821b;

    /* renamed from: c, reason: collision with root package name */
    public String f13822c;

    /* renamed from: d, reason: collision with root package name */
    public int f13823d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13824e;

    /* renamed from: f, reason: collision with root package name */
    public int f13825f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13826g;

    public f(y yVar) {
        this.a = yVar.d();
        this.f13821b = yVar.f();
        this.f13822c = yVar.h();
        this.f13823d = yVar.i();
        this.f13824e = yVar.p();
        this.f13825f = yVar.k();
        this.f13826g = yVar.a();
    }

    public boolean a() {
        int[] iArr = this.f13826g;
        return iArr != null && iArr.length > 0;
    }

    public boolean b() {
        return !TextUtils.isEmpty(this.a);
    }

    public boolean c() {
        return !TextUtils.isEmpty(this.f13821b);
    }

    public boolean d() {
        return !TextUtils.isEmpty(this.f13822c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13823d != fVar.f13823d || this.f13824e != fVar.f13824e || this.f13825f != fVar.f13825f) {
            return false;
        }
        String str = this.a;
        if (str == null ? fVar.a != null : !str.equals(fVar.a)) {
            return false;
        }
        String str2 = this.f13821b;
        if (str2 == null ? fVar.f13821b != null : !str2.equals(fVar.f13821b)) {
            return false;
        }
        String str3 = this.f13822c;
        if (str3 == null ? fVar.f13822c == null : str3.equals(fVar.f13822c)) {
            return Arrays.equals(this.f13826g, fVar.f13826g);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13821b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13822c;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f13823d) * 31) + (this.f13824e ? 1 : 0)) * 31) + this.f13825f) * 31) + Arrays.hashCode(this.f13826g);
    }
}