package com.parizene.netmonitor.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.b;
import com.parizene.netmonitor.k0.d;
import java.util.Locale;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class SettingsFragment extends androidx.preference.g implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final c k0 = new a();
    com.parizene.netmonitor.k0.e l0;
    com.parizene.netmonitor.db.celllog.b m0;
    SharedPreferences n0;
    com.parizene.netmonitor.x o0;
    com.parizene.netmonitor.s0.e.c p0;
    org.greenrobot.eventbus.c q0;
    Handler r0;
    l1 s0;
    private c t0 = k0;

    class a implements c {
        a() {
        }

        @Override // com.parizene.netmonitor.ui.SettingsFragment.c
        public /* synthetic */ void q() {
            j1.a(this);
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.parizene.netmonitor.m0.d f13749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13750f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13751g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13752h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13753i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13754j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ RadioGroup f13755k;

        b(com.parizene.netmonitor.m0.d dVar, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, RadioGroup radioGroup4, RadioGroup radioGroup5, RadioGroup radioGroup6) {
            this.f13749e = dVar;
            this.f13750f = radioGroup;
            this.f13751g = radioGroup2;
            this.f13752h = radioGroup3;
            this.f13753i = radioGroup4;
            this.f13754j = radioGroup5;
            this.f13755k = radioGroup6;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
            com.parizene.netmonitor.m0.d dVar = this.f13749e;
            dVar.a = dVar.f13347b[this.f13750f.getCheckedRadioButtonId() - 1000];
            com.parizene.netmonitor.m0.d dVar2 = this.f13749e;
            dVar2.f13348c = dVar2.f13349d[this.f13751g.getCheckedRadioButtonId() - 2000];
            com.parizene.netmonitor.m0.d dVar3 = this.f13749e;
            dVar3.f13350e = dVar3.f13351f[this.f13752h.getCheckedRadioButtonId() - 2001];
            com.parizene.netmonitor.m0.d dVar4 = this.f13749e;
            dVar4.f13352g = dVar4.f13353h[this.f13753i.getCheckedRadioButtonId() - 3000];
            com.parizene.netmonitor.m0.d dVar5 = this.f13749e;
            dVar5.f13354i = dVar5.f13355j[this.f13754j.getCheckedRadioButtonId() - 4000];
            com.parizene.netmonitor.m0.d dVar6 = this.f13749e;
            dVar6.f13356k = dVar6.f13357l[this.f13755k.getCheckedRadioButtonId() - 5000];
            String strC = com.parizene.netmonitor.m0.d.c(this.f13749e);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            com.parizene.netmonitor.t0.f.a.f(strC);
        }
    }

    public interface c {
        void q();
    }

    private void Z2(RadioGroup radioGroup, com.parizene.netmonitor.m0.b0.c cVar, com.parizene.netmonitor.m0.b0.c[] cVarArr, int i2) {
        for (int i3 = 0; i3 < cVarArr.length; i3++) {
            com.parizene.netmonitor.m0.b0.c cVar2 = cVarArr[i3];
            RadioButton radioButton = new RadioButton(m2());
            radioButton.setLayoutParams(new RadioGroup.LayoutParams(-2, -2));
            radioButton.setText(cVar2.e());
            radioButton.setId(i2 + i3);
            if (cVar2 == cVar) {
                radioButton.setChecked(true);
            }
            radioGroup.addView(radioButton);
        }
    }

    private Locale a3() {
        return c.h.h.b.a(F0().getConfiguration()).c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e3() {
        F2(com.parizene.netmonitor.s0.d.c.n(), 103);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g3() {
        D2(new Intent("android.settings.panel.action.WIFI"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i3() {
        this.p0.y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k3() {
        D2(new Intent("android.settings.panel.action.WIFI"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m3() {
        this.p0.y(false);
    }

    private void p3() {
        com.parizene.netmonitor.m0.d dVarB = com.parizene.netmonitor.m0.d.b(com.parizene.netmonitor.t0.f.a.g());
        View viewInflate = y0().inflate(R.layout.dialog_cell_config, (ViewGroup) null);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.old_gsm_current_group);
        Z2(radioGroup, dVarB.a, dVarB.f13347b, CoreConstants.MILLIS_IN_ONE_SECOND);
        RadioGroup radioGroup2 = (RadioGroup) viewInflate.findViewById(R.id.old_wcdma_current_group);
        Z2(radioGroup2, dVarB.f13348c, dVarB.f13349d, 2000);
        RadioGroup radioGroup3 = (RadioGroup) viewInflate.findViewById(R.id.old_wcdma_neighboring_group);
        Z2(radioGroup3, dVarB.f13350e, dVarB.f13351f, 2001);
        RadioGroup radioGroup4 = (RadioGroup) viewInflate.findViewById(R.id.new_gsm_group);
        Z2(radioGroup4, dVarB.f13352g, dVarB.f13353h, 3000);
        RadioGroup radioGroup5 = (RadioGroup) viewInflate.findViewById(R.id.new_wcdma_group);
        Z2(radioGroup5, dVarB.f13354i, dVarB.f13355j, 4000);
        RadioGroup radioGroup6 = (RadioGroup) viewInflate.findViewById(R.id.new_lte_group);
        Z2(radioGroup6, dVarB.f13356k, dVarB.f13357l, Level.TRACE_INT);
        ScrollView scrollView = new ScrollView(m2());
        scrollView.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        b.a aVar = new b.a(m2());
        aVar.u(Build.MANUFACTURER + " | " + Build.MODEL + " | " + Build.DEVICE);
        aVar.v(scrollView);
        aVar.o(android.R.string.ok, new b(dVarB, radioGroup, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6));
        aVar.a().show();
    }

    private void q3(int i2, final Runnable runnable) {
        b.a aVar = new b.a(m2());
        aVar.h(i2).d(false).o(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                runnable.run();
            }
        });
        aVar.k(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.d0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.cancel();
            }
        });
        aVar.a().show();
    }

    @Override // androidx.preference.g
    public void P2(Bundle bundle, String str) {
        X2(R.xml.settings, str);
    }

    @Override // androidx.preference.g, androidx.preference.j.c
    public boolean X(Preference preference) {
        String strQ = preference.q();
        if (strQ != null) {
            if (strQ.equals(L0(R.string.pref_about_key))) {
                this.l0.a(d.h.f13211d);
                View viewInflate = y0().inflate(R.layout.dialog_about, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(R.id.version_num)).setText("1.10.2 (307)");
                b.a aVar = new b.a(m2());
                aVar.v(viewInflate);
                aVar.o(android.R.string.ok, null);
                aVar.a().show();
                return true;
            }
            if (strQ.equals(L0(R.string.pref_rate_it_key))) {
                this.l0.a(d.h.a);
                e1.a.d(k2());
                return true;
            }
            if (strQ.equals(L0(R.string.pref_changelog_key))) {
                String language = a3().getLanguage();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse((language.equals("ru") || language.equals("be")) ? "https://sites.google.com/view/netmonitor-changelog-ru" : "https://sites.google.com/view/netmonitor-changelog-en"));
                D2(intent);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_cell_config_key))) {
                this.l0.a(d.h.f13209b);
                p3();
                return true;
            }
            if (strQ.equals(L0(R.string.pref_privacy_policy_key))) {
                this.l0.a(d.h.f13210c);
                D2(e1.b());
                return true;
            }
        }
        return super.X(preference);
    }

    @Override // androidx.fragment.app.Fragment
    public void g1(int i2, int i3, Intent intent) {
        if (103 == i2) {
            if (this.o0.m("gps")) {
                Toast.makeText(m2(), R.string.toast_gps_enabled, 1).show();
            } else {
                Toast.makeText(m2(), R.string.toast_gps_disabled, 1).show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        if (context instanceof c) {
            this.t0 = (c) context;
            return;
        }
        throw new ClassCastException(context.toString() + " should implement SettingsFragment.Callback");
    }

    @Override // androidx.preference.g, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13723h;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) t(bVar.c());
        if (!bVar.b()) {
            checkBoxPreference.F0(bVar.a().booleanValue());
        }
        ((EditTextPreference) t(L0(R.string.pref_location_min_time_key))).M0(new EditTextPreference.a() { // from class: com.parizene.netmonitor.ui.h0
            @Override // androidx.preference.EditTextPreference.a
            public final void a(EditText editText) {
                editText.setInputType(2);
            }
        });
        ((EditTextPreference) t(L0(R.string.pref_location_min_distance_key))).M0(new EditTextPreference.a() { // from class: com.parizene.netmonitor.ui.f0
            @Override // androidx.preference.EditTextPreference.a
            public final void a(EditText editText) {
                editText.setInputType(2);
            }
        });
        this.n0.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13718c;
        if (str.equals(bVar.c())) {
            Runnable runnable = new Runnable() { // from class: com.parizene.netmonitor.ui.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13830e.e3();
                }
            };
            boolean zBooleanValue = bVar.g().booleanValue();
            this.l0.a(d.h.d(zBooleanValue));
            if (zBooleanValue) {
                if (this.o0.m("gps")) {
                    return;
                }
                q3(R.string.dialog_gps_disabled_message, runnable);
                return;
            } else {
                if (this.o0.m("gps")) {
                    q3(R.string.dialog_gps_enabled_message, runnable);
                    return;
                }
                return;
            }
        }
        com.parizene.netmonitor.t0.b bVar2 = com.parizene.netmonitor.t0.f.f13719d;
        if (str.equals(bVar2.c())) {
            boolean zBooleanValue2 = bVar2.g().booleanValue();
            this.l0.a(d.h.e(zBooleanValue2));
            if (zBooleanValue2) {
                if (3 != this.p0.t()) {
                    q3(R.string.dialog_wifi_disabled_message, Build.VERSION.SDK_INT >= 29 ? new Runnable() { // from class: com.parizene.netmonitor.ui.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13771e.g3();
                        }
                    } : new Runnable() { // from class: com.parizene.netmonitor.ui.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13838e.i3();
                        }
                    });
                    return;
                }
                return;
            } else {
                if (3 == this.p0.t()) {
                    q3(R.string.dialog_wifi_enabled_message, Build.VERSION.SDK_INT >= 29 ? new Runnable() { // from class: com.parizene.netmonitor.ui.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13769e.k3();
                        }
                    } : new Runnable() { // from class: com.parizene.netmonitor.ui.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13834e.m3();
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (str.equals(L0(R.string.pref_theme_id_key))) {
            n1 n1VarC = this.s0.c();
            this.l0.a(d.h.g(b.f.a(n1VarC)));
            this.s0.b(n1VarC);
            return;
        }
        com.parizene.netmonitor.t0.b bVar3 = com.parizene.netmonitor.t0.f.f13720e;
        if (str.equals(bVar3.c())) {
            this.l0.a(d.h.c(bVar3.g().booleanValue()));
            return;
        }
        if (str.equals(L0(R.string.pref_use_dbm_ranges_colors_key))) {
            this.l0.a(d.h.h(com.parizene.netmonitor.t0.f.B.g().booleanValue()));
            return;
        }
        com.parizene.netmonitor.t0.b bVar4 = com.parizene.netmonitor.t0.f.f13724i;
        if (str.equals(bVar4.c())) {
            this.l0.a(d.h.f(bVar4.g().booleanValue()));
            return;
        }
        com.parizene.netmonitor.t0.b bVar5 = com.parizene.netmonitor.t0.f.f13723h;
        if (str.equals(bVar5.c())) {
            this.l0.a(d.h.b(bVar5.g().booleanValue()));
            return;
        }
        com.parizene.netmonitor.t0.b bVar6 = com.parizene.netmonitor.t0.f.f13727l;
        if (str.equals(bVar6.c())) {
            this.l0.setEnabled(bVar6.g().booleanValue());
        } else if (str.equals(com.parizene.netmonitor.t0.f.y.c())) {
            this.t0.q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.n0.unregisterOnSharedPreferenceChangeListener(this);
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void t1() {
        super.t1();
        this.t0 = k0;
    }
}