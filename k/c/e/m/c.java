package k.c.e.m;

import java.util.concurrent.ThreadFactory;

/* compiled from: ConfigurablePriorityThreadFactory.java */
/* loaded from: classes3.dex */
public class c implements ThreadFactory {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16625b;

    public c(int i2, String str) {
        this.a = i2;
        this.f16625b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.a);
        String str = this.f16625b;
        if (str != null) {
            thread.setName(str);
        }
        return thread;
    }
}