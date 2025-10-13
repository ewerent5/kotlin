package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class i12 extends l12 {

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ j12 f6455k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i12(j12 j12Var, m12 m12Var, CharSequence charSequence) {
        super(m12Var, charSequence);
        this.f6455k = j12Var;
    }

    @Override // com.google.android.gms.internal.ads.l12
    final int c(int i2) {
        t02 t02Var = this.f6455k.a;
        CharSequence charSequence = this.f7158g;
        int length = charSequence.length();
        h12.e(i2, length, "index");
        while (i2 < length) {
            if (t02Var.a(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.l12
    final int d(int i2) {
        return i2 + 1;
    }
}