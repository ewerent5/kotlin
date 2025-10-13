package com.parizene.netmonitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: HandlerHelper.java */
/* loaded from: classes.dex */
public class w {
    private static final Handler[] a = new Handler[a.values().length];

    /* compiled from: HandlerHelper.java */
    public enum a {
        UI,
        BG,
        CORE,
        WEB
    }

    static {
        int i2 = 0;
        while (true) {
            Handler[] handlerArr = a;
            if (i2 >= handlerArr.length) {
                return;
            }
            handlerArr[i2] = a(a.values()[i2]);
            i2++;
        }
    }

    private static Handler a(a aVar) {
        Looper looper;
        if (aVar == a.UI) {
            looper = Looper.getMainLooper();
        } else {
            HandlerThread handlerThread = new HandlerThread(aVar.toString());
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        return new Handler(looper);
    }

    public static Handler b(a aVar) {
        return a[aVar.ordinal()];
    }

    public static void c() {
        for (Handler handler : a) {
            Looper looper = handler.getLooper();
            if (looper != Looper.getMainLooper()) {
                looper.quit();
            }
        }
    }
}