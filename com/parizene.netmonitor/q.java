package com.parizene.netmonitor;

import android.content.Context;
import android.content.Intent;

/* compiled from: FieldTest.java */
/* loaded from: classes.dex */
public class q {
    private Intent a;

    public q(Context context) {
        Intent[] intentArr = {a(context), c(context), e(context), d(context)};
        for (int i2 = 0; i2 < 4; i2++) {
            Intent intent = intentArr[i2];
            if (intent != null) {
                this.a = intent;
                intent.setFlags(268435456);
                return;
            }
        }
    }

    private static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.htc.fieldtest", "com.htc.fieldtest.FieldTestActivity");
        if (j0.g(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.lge.hiddenmenu", "com.lge.hiddenmenu.HiddenMenu");
        if (j0.g(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent d(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.mediatek.engineermode", "com.mediatek.engineermode.EngineerMode");
        if (j0.g(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent e(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.app.telephonyui", "com.samsung.android.app.telephonyui.hiddennetworksetting.MainActivity");
        if (j0.g(context, intent)) {
            return intent;
        }
        intent.setClassName("com.sec.android.app.servicemodeapp", "com.sec.android.app.servicemodeapp.ServiceModeApp");
        intent.putExtra("keyString", "197328640");
        if (j0.g(context, intent)) {
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setClassName("com.cyanogenmod.samsungservicemode", "com.cyanogenmod.samsungservicemode.SamsungServiceModeActivity");
        if (j0.g(context, intent2)) {
            return intent2;
        }
        return null;
    }

    public Intent b() {
        return this.a;
    }
}