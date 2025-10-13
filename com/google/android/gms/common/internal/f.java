package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class f implements DialogInterface.OnClickListener {
    public static f a(Activity activity, Intent intent, int i2) {
        return new x(intent, activity, i2);
    }

    protected abstract void b();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            b();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}