package com.google.android.gms.internal.ads;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class k12 implements Iterable<String>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CharSequence f6923e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m12 f6924f;

    k12(m12 m12Var, CharSequence charSequence) {
        this.f6924f = m12Var;
        this.f6923e = charSequence;
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator<String> iterator() {
        return this.f6924f.f(this.f6923e);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(y02.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(y02.a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}