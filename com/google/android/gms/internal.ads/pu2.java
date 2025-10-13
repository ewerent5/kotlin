package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import ch.qos.logback.core.net.SyslogConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(SyslogConstants.LOG_DAEMON)
/* loaded from: classes.dex */
final class pu2 {
    private final MediaCodec.CryptoInfo a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f8271b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* synthetic */ void a(pu2 pu2Var, int i2, int i3) {
        pu2Var.f8271b.set(0, 0);
        pu2Var.a.setPattern(pu2Var.f8271b);
    }
}