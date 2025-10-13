package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import e.c.b.d.a.b.s;

/* loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    private ResultReceiver f12212e;

    public static void a(Context context) throws PackageManager.NameNotFoundException {
        s.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i4;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && (resultReceiver = this.f12212e) != null) {
            if (i3 == -1) {
                bundle = new Bundle();
                i4 = 1;
            } else if (i3 == 0) {
                bundle = new Bundle();
                i4 = 2;
            }
            resultReceiver.send(i4, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12212e = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f12212e = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        try {
            startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ResultReceiver resultReceiver = this.f12212e;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f12212e);
    }
}