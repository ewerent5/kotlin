package okhttp3.internal.http2;

import i.y.d.g;
import i.y.d.l;
import j.h;
import java.util.List;

/* compiled from: PushObserver.kt */
/* loaded from: classes3.dex */
public interface PushObserver {
    public static final Companion Companion = new Companion(null);
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: PushObserver.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: PushObserver.kt */
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i2, h hVar, int i3, boolean z) {
                l.d(hVar, "source");
                hVar.h(i3);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i2, List<Header> list, boolean z) {
                l.d(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i2, List<Header> list) {
                l.d(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i2, ErrorCode errorCode) {
                l.d(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    boolean onData(int i2, h hVar, int i3, boolean z);

    boolean onHeaders(int i2, List<Header> list, boolean z);

    boolean onRequest(int i2, List<Header> list);

    void onReset(int i2, ErrorCode errorCode);
}