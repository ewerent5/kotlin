package com.parizene.netmonitor.ui;

import android.content.Context;
import com.parizene.netmonitor.App;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.SettingsFragment;
import java.util.Objects;

/* compiled from: SettingsFragmentActivity.kt */
/* loaded from: classes3.dex */
public final class SettingsFragmentActivity extends o1 implements SettingsFragment.c {
    @Override // com.parizene.netmonitor.ui.o1
    public int U() {
        return R.layout.activity_settings_fragment;
    }

    @Override // com.parizene.netmonitor.ui.SettingsFragment.c
    public void q() {
        finish();
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.parizene.netmonitor.App");
        ((App) applicationContext).i();
    }
}