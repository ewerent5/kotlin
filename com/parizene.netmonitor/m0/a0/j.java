package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.PhoneStateListener;
import java.lang.reflect.Field;

/* compiled from: PhoneStateListenerExtender.java */
/* loaded from: classes.dex */
public class j {
    private final Field a;

    public j() throws NoSuchFieldException {
        Field fieldA = com.parizene.netmonitor.o0.a.a(PhoneStateListener.class, "mSubId");
        if (fieldA == null) {
            throw new IllegalStateException("PhoneStateListener.mSubId not available");
        }
        this.a = fieldA;
    }

    public void a(PhoneStateListener phoneStateListener, int i2) throws IllegalAccessException, IllegalArgumentException {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a.set(phoneStateListener, Integer.valueOf(i2));
            } else {
                this.a.setInt(phoneStateListener, i2);
            }
        } catch (Exception e2) {
            m.a.a.g(e2);
        }
    }
}