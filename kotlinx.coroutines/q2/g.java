package kotlinx.coroutines.q2;

import kotlinx.coroutines.internal.y;

/* compiled from: Channel.kt */
/* loaded from: classes3.dex */
public interface g<E> extends t<E>, p<E> {
    public static final a a = a.f17056b;

    /* compiled from: Channel.kt */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ a f17056b = new a();
        private static final int a = y.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private a() {
        }

        public final int a() {
            return a;
        }
    }
}