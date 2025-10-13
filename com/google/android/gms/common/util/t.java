package com.google.android.gms.common.util;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class t {
    public static int a(int i2) {
        if (i2 == -1) {
            return -1;
        }
        return i2 / CoreConstants.MILLIS_IN_ONE_SECOND;
    }
}