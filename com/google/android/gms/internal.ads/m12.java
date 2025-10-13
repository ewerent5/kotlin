package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m12 {
    private final t02 a;

    /* renamed from: b, reason: collision with root package name */
    private final j12 f7397b;

    private m12(j12 j12Var, byte[] bArr) {
        s02 s02Var = s02.f8808b;
        this.f7397b = j12Var;
        this.a = s02Var;
    }

    public static m12 a(t02 t02Var) {
        return new m12(new j12(t02Var), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> f(CharSequence charSequence) {
        return new i12(this.f7397b, this, charSequence);
    }

    public final Iterable<String> b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new k12(this, charSequence);
    }

    public final List<String> c(CharSequence charSequence) {
        Iterator<String> itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add(itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}