package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fd implements com.google.android.gms.common.util.o {
    private final ba a;

    fd(ba baVar) {
        this.a = baVar;
    }

    @Override // com.google.android.gms.common.util.o
    public final boolean apply(Object obj) {
        ba baVar = (ba) obj;
        return (baVar instanceof hd) && ((hd) baVar).a.equals(this.a);
    }
}