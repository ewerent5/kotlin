package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class xx2 {
    private final av2[] a;

    /* renamed from: b, reason: collision with root package name */
    private final bv2 f10304b;

    /* renamed from: c, reason: collision with root package name */
    private av2 f10305c;

    public xx2(av2[] av2VarArr, bv2 bv2Var) {
        this.a = av2VarArr;
        this.f10304b = bv2Var;
    }

    public final void a() {
        if (this.f10305c != null) {
            this.f10305c = null;
        }
    }

    public final av2 b(zu2 zu2Var, Uri uri) throws wy2 {
        av2 av2Var = this.f10305c;
        if (av2Var != null) {
            return av2Var;
        }
        av2[] av2VarArr = this.a;
        int length = av2VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            av2 av2Var2 = av2VarArr[i2];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zu2Var.g();
                throw th;
            }
            if (av2Var2.c(zu2Var)) {
                this.f10305c = av2Var2;
                zu2Var.g();
                break;
            }
            continue;
            zu2Var.g();
            i2++;
        }
        av2 av2Var3 = this.f10305c;
        if (av2Var3 != null) {
            av2Var3.d(this.f10304b);
            return this.f10305c;
        }
        String strN = v03.n(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(strN);
        sb.append(") could read the stream.");
        throw new wy2(sb.toString(), uri);
    }
}