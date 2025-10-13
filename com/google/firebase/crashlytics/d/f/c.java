package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public class c implements b, a {
    private final e a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12331b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f12332c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f12334e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f12333d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f12335f = false;

    public c(e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
        this.f12331b = i2;
        this.f12332c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.d.f.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f12333d) {
            com.google.firebase.crashlytics.d.b.f().b("Logging Crashlytics event to Firebase");
            this.f12334e = new CountDownLatch(1);
            this.f12335f = false;
            this.a.a(str, bundle);
            com.google.firebase.crashlytics.d.b.f().b("Awaiting app exception callback from FA...");
            try {
                if (this.f12334e.await(this.f12331b, this.f12332c)) {
                    this.f12335f = true;
                    com.google.firebase.crashlytics.d.b.f().b("App exception callback received from FA listener.");
                } else {
                    com.google.firebase.crashlytics.d.b.f().b("Timeout exceeded while awaiting app exception callback from FA listener.");
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.d.b.f().b("Interrupted while awaiting app exception callback from FA listener.");
            }
            this.f12334e = null;
        }
    }

    @Override // com.google.firebase.crashlytics.d.f.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12334e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}