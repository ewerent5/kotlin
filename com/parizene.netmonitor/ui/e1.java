package com.parizene.netmonitor.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;

/* compiled from: NavigationUtils.kt */
/* loaded from: classes3.dex */
public final class e1 {
    public static final a a = new a(null);

    /* compiled from: NavigationUtils.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }

        public final Intent a() {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.parizene.netmonitor", null));
            return intent;
        }

        public final Intent b() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://sites.google.com/view/netmonitor-privacy-policy"));
            return intent;
        }

        public final Intent c(Context context) {
            i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setClassName("com.android.settings", "com.android.settings.RadioInfo");
            if (com.parizene.netmonitor.j0.g(context, intent)) {
                return intent;
            }
            intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
            if (com.parizene.netmonitor.j0.g(context, intent)) {
                return intent;
            }
            return null;
        }

        public final void d(Context context) {
            i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.parizene.netmonitor"));
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                m.a.a.g(e2);
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.parizene.netmonitor")));
                } catch (ActivityNotFoundException e3) {
                    m.a.a.g(e3);
                }
            }
        }
    }

    public static final Intent a() {
        return a.a();
    }

    public static final Intent b() {
        return a.b();
    }
}