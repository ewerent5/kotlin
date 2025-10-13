package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mr extends ScheduledThreadPoolExecutor {
    mr(int i2, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}