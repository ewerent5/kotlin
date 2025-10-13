package okhttp3;

import j.e0;

/* compiled from: Call.kt */
/* loaded from: classes3.dex */
public interface Call extends Cloneable {

    /* compiled from: Call.kt */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    e0 timeout();
}