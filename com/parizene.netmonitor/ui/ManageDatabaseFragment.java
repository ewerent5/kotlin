package com.parizene.netmonitor.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.material.snackbar.Snackbar;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.db.celllog.ExportCellService;
import com.parizene.netmonitor.db.celllog.ImportCellService;
import com.parizene.netmonitor.db.i.b;
import com.parizene.netmonitor.k0.b;
import com.parizene.netmonitor.k0.d;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* loaded from: classes3.dex */
public class ManageDatabaseFragment extends androidx.preference.g implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final h k0 = new a();
    private static com.parizene.netmonitor.db.celllog.h l0;
    private static com.parizene.netmonitor.db.celllog.g m0;
    com.parizene.netmonitor.k0.e n0;
    com.parizene.netmonitor.db.celllog.b o0;
    com.parizene.netmonitor.a0 p0;
    com.parizene.netmonitor.db.i.b q0;
    SharedPreferences r0;
    Handler s0;
    Handler t0;
    com.parizene.netmonitor.x u0;
    com.parizene.netmonitor.m0.d0.d v0;
    com.parizene.netmonitor.u w0;
    c.p.a.a x0;
    com.parizene.netmonitor.k y0;
    private h z0 = k0;

    class a implements h {
        a() {
        }
    }

    class b implements b.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void e(int[] iArr) {
            Toast.makeText(ManageDatabaseFragment.this.m2(), ManageDatabaseFragment.this.M0(R.string.create_backup_msg, Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2])), 1).show();
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void a() {
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void b(int i2) {
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void c(final int[] iArr) {
            ManageDatabaseFragment.this.t0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13832e.e(iArr);
                }
            });
        }
    }

    class c implements b.a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void e(int[] iArr) {
            Toast.makeText(ManageDatabaseFragment.this.m2(), ManageDatabaseFragment.this.M0(R.string.restore_backup_msg, Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2])), 1).show();
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void a() {
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void b(int i2) {
        }

        @Override // com.parizene.netmonitor.db.i.b.a
        public void c(final int[] iArr) {
            ManageDatabaseFragment.this.t0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13835e.e(iArr);
                }
            });
            ManageDatabaseFragment.this.x0.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(ManageDatabaseFragment.this.m2(), ManageDatabaseFragment.this.M0(R.string.clear_db_result, Integer.valueOf(ManageDatabaseFragment.this.o0.d())), 1).show();
            ManageDatabaseFragment.this.x0.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
            ManageDatabaseFragment.this.n0.a(d.e.f13207c);
        }
    }

    class e implements DialogInterface.OnClickListener {

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.parizene.netmonitor.db.celllog.i.g f13740e;

            a(com.parizene.netmonitor.db.celllog.i.g gVar) {
                this.f13740e = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                long jT = ManageDatabaseFragment.this.o0.t(this.f13740e);
                if (jT <= 0) {
                    Toast.makeText(ManageDatabaseFragment.this.m2(), R.string.nothing_to_export, 0).show();
                    return;
                }
                ManageDatabaseFragment.this.n0.a(d.e.b(b.c.a(this.f13740e)));
                Context contextM2 = ManageDatabaseFragment.this.m2();
                ManageDatabaseFragment manageDatabaseFragment = ManageDatabaseFragment.this;
                com.parizene.netmonitor.db.celllog.g unused = ManageDatabaseFragment.m0 = new com.parizene.netmonitor.db.celllog.g(contextM2, manageDatabaseFragment.p0, manageDatabaseFragment.o0, manageDatabaseFragment.y0, this.f13740e, jT, com.parizene.netmonitor.t0.f.f13728m.g().booleanValue(), com.parizene.netmonitor.t0.f.n.g().booleanValue());
                ManageDatabaseFragment.m0.execute(new Void[0]);
            }
        }

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            ManageDatabaseFragment.this.s0.post(new a(com.parizene.netmonitor.db.celllog.i.g.values()[i2]));
        }
    }

    class f implements Runnable {

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f13743e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f13744f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f13745g;

            /* renamed from: com.parizene.netmonitor.ui.ManageDatabaseFragment$f$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0165a implements DialogInterface.OnClickListener {

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ TimestampRangeView f13747e;

                DialogInterfaceOnClickListenerC0165a(TimestampRangeView timestampRangeView) {
                    this.f13747e = timestampRangeView;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    long jG = this.f13747e.g() + (a.this.f13743e % 1000);
                    long jF = this.f13747e.f();
                    a aVar = a.this;
                    long j2 = aVar.f13744f;
                    long j3 = jF + (j2 % 1000);
                    if (j3 == aVar.f13743e && j3 == j2) {
                        jG = Long.MIN_VALUE;
                        j3 = Long.MAX_VALUE;
                    }
                    ManageDatabaseFragment.this.L3(jG, j3, aVar.f13745g);
                }
            }

            a(long j2, long j3, long j4) {
                this.f13743e = j2;
                this.f13744f = j3;
                this.f13745g = j4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f13743e == Long.MIN_VALUE || this.f13744f == Long.MAX_VALUE || this.f13745g == 0) {
                    ManageDatabaseFragment.this.L3(Long.MIN_VALUE, Long.MAX_VALUE, this.f13745g);
                    return;
                }
                b.a aVar = new b.a(ManageDatabaseFragment.this.m2());
                aVar.t(R.string.timestamp_range);
                View viewInflate = LayoutInflater.from(ManageDatabaseFragment.this.m2()).inflate(R.layout.view_timestamp_range, (ViewGroup) null);
                TimestampRangeView timestampRangeView = new TimestampRangeView(ManageDatabaseFragment.this.m2(), viewInflate);
                timestampRangeView.i(this.f13743e, this.f13744f);
                aVar.v(viewInflate);
                aVar.o(R.string.export, new DialogInterfaceOnClickListenerC0165a(timestampRangeView));
                aVar.k(android.R.string.cancel, null);
                aVar.a().show();
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jX = ManageDatabaseFragment.this.o0.x();
            long jY = ManageDatabaseFragment.this.o0.y();
            ManageDatabaseFragment.this.t0.post(new a(jX, jY, ManageDatabaseFragment.this.o0.u(jX, jY)));
        }
    }

    class g implements FilenameFilter {
        g() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            int length = str.length() - 4;
            return length >= 0 && str.substring(length).equalsIgnoreCase(".clf");
        }
    }

    public interface h {
    }

    private void G3(Snackbar snackbar) {
        Context contextM2 = m2();
        snackbar.g0(com.parizene.netmonitor.h0.d(contextM2, R.attr.color_snackbar_bg));
        snackbar.j0(com.parizene.netmonitor.h0.d(contextM2, R.attr.color_snackbar_text));
        snackbar.f0(com.parizene.netmonitor.h0.d(contextM2, R.attr.color_snackbar_action_text));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(long j2, long j3, long j4) {
        this.n0.a(d.e.a);
        com.parizene.netmonitor.db.celllog.h hVar = new com.parizene.netmonitor.db.celllog.h(m2(), this.p0, this.o0, this.v0, this.y0, j2, j3, j4, com.parizene.netmonitor.t0.f.f13728m.g().booleanValue(), com.parizene.netmonitor.t0.f.n.g().booleanValue());
        l0 = hVar;
        hVar.execute(new Void[0]);
    }

    private void c3() {
        this.s0.post(new d());
    }

    private void d3() {
        this.s0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f13837e.i3();
            }
        });
    }

    private Intent g3() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(this.y0.d(new File(this.y0.b(), "cell_log.kml")), "application/vnd.google-earth.kml+xml");
        intent.setPackage("com.google.earth");
        intent.addFlags(1);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i3() {
        Toast.makeText(m2(), M0(R.string.clear_db_result, Integer.valueOf(this.w0.a())), 1).show();
        this.x0.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
        this.n0.a(d.e.f13208d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k3() {
        this.o0.b();
        Toast.makeText(m2(), "Finished!", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m3() {
        this.q0.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void o3(View view) {
        try {
            D2(e1.a());
        } catch (ActivityNotFoundException e2) {
            m.a.a.g(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q3(DialogInterface dialogInterface, int i2) {
        c1.m(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s3() {
        this.q0.b(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u3(List list, DialogInterface dialogInterface, int i2) {
        com.parizene.netmonitor.db.celllog.i.o oVar = (com.parizene.netmonitor.db.celllog.i.o) list.get(i2);
        Intent intent = new Intent(m2(), (Class<?>) ExportCellService.class);
        intent.putExtra("clf_type", com.parizene.netmonitor.n0.e.values()[com.parizene.netmonitor.t0.f.D.f().intValue()]);
        intent.putExtra("mcc", oVar.a);
        intent.putExtra("mnc", oVar.f13135b);
        m2().startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w3(String[] strArr, final List list) {
        b.a aVar = new b.a(m2());
        aVar.t(R.string.dialog_export_db_title);
        aVar.g(strArr, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13933e.u3(list, dialogInterface, i2);
            }
        });
        aVar.k(android.R.string.cancel, null);
        aVar.a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y3() {
        final List<com.parizene.netmonitor.db.celllog.i.o> listA = this.o0.A();
        int size = listA.size();
        final String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = listA.get(i2).a();
        }
        this.t0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f13850e.w3(strArr, listA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void A3(File file, String[] strArr, DialogInterface dialogInterface, int i2) {
        int iIntValue = com.parizene.netmonitor.t0.f.C.f().intValue();
        this.n0.a(d.e.c(b.d.a(iIntValue)));
        Intent intent = new Intent(m2(), (Class<?>) ImportCellService.class);
        intent.putExtra("path", new File(file, strArr[i2]).getPath());
        intent.putExtra("clf_type", com.parizene.netmonitor.n0.e.values()[iIntValue]);
        m2().startService(intent);
    }

    void B3() {
        Snackbar snackbarA0 = Snackbar.a0(n2(), R.string.permissions_not_granted_msg, -1);
        G3(snackbarA0);
        snackbarA0.Q();
    }

    void C3() {
        Snackbar snackbarA0 = Snackbar.a0(n2(), R.string.permissions_not_granted_msg, 0);
        G3(snackbarA0);
        snackbarA0.d0(R.string.open_settings, new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13842e.o3(view);
            }
        }).Q();
    }

    void D3(l.a.a aVar) {
        aVar.a();
    }

    void E3() {
        this.n0.a(d.e.f13206b);
        D2(g3());
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(int i2, String[] strArr, int[] iArr) {
        super.F1(i2, strArr, iArr);
        c1.k(this, i2, iArr);
    }

    void F3() {
        this.s0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f14016e.s3();
            }
        });
    }

    void H3() {
        if (Environment.getExternalStorageState().equals("mounted") && this.y0.a()) {
            this.s0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13992e.y3();
                }
            });
        }
    }

    void I3() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            final File fileB = this.y0.b();
            if (fileB.exists()) {
                final String[] list = fileB.list(new g());
                b.a aVar = new b.a(m2());
                aVar.t(R.string.dialog_import_db_title);
                aVar.g(list, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.p
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f14008e.A3(fileB, list, dialogInterface, i2);
                    }
                });
                aVar.k(android.R.string.cancel, null);
                aVar.a().show();
            }
        }
    }

    void J3() {
        com.parizene.netmonitor.db.celllog.g gVar = m0;
        if (gVar != null && gVar.getStatus() == AsyncTask.Status.RUNNING) {
            Toast.makeText(m2(), R.string.already_exporting_clf, 0).show();
            return;
        }
        com.parizene.netmonitor.db.celllog.g gVar2 = m0;
        if (gVar2 == null || gVar2.getStatus() == AsyncTask.Status.FINISHED) {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                Toast.makeText(m2(), R.string.toast_sdcard_is_unmounted, 0).show();
                return;
            }
            CharSequence[] charSequenceArr = {com.parizene.netmonitor.db.celllog.i.g.CELL.name().toUpperCase(), com.parizene.netmonitor.db.celllog.i.g.DBM.name().toUpperCase(), com.parizene.netmonitor.db.celllog.i.g.GPS.name().toUpperCase()};
            b.a aVar = new b.a(m2());
            aVar.t(R.string.change_type);
            aVar.g(charSequenceArr, new e());
            aVar.k(android.R.string.cancel, null);
            aVar.a().show();
        }
    }

    void K3() {
        com.parizene.netmonitor.db.celllog.h hVar = l0;
        if (hVar != null && hVar.getStatus() == AsyncTask.Status.RUNNING) {
            Toast.makeText(m2(), R.string.already_exporting_kml, 0).show();
            return;
        }
        com.parizene.netmonitor.db.celllog.h hVar2 = l0;
        if (hVar2 == null || hVar2.getStatus() == AsyncTask.Status.FINISHED) {
            if (Environment.getExternalStorageState().equals("mounted")) {
                this.s0.post(new f());
            } else {
                Toast.makeText(m2(), R.string.toast_sdcard_is_unmounted, 0).show();
            }
        }
    }

    @Override // androidx.preference.g
    public void P2(Bundle bundle, String str) {
        X2(R.xml.manage_db, str);
    }

    @Override // androidx.preference.g, androidx.preference.j.c
    public boolean X(Preference preference) {
        String strQ = preference.q();
        if (strQ != null) {
            if (strQ.equals(L0(R.string.pref_view_new_log_kml_key))) {
                c1.l(this);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_export_new_log_clf_key))) {
                c1.p(this);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_export_new_log_kml_key))) {
                c1.q(this);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_import_db))) {
                c1.o(this);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_export_db))) {
                c1.n(this);
                return true;
            }
            if (strQ.equals(L0(R.string.pref_clear_db))) {
                c3();
                return true;
            }
            if ("copy_to_sdcard".equals(strQ)) {
                c1.i(this);
            } else {
                if (strQ.equals(L0(R.string.pref_create_backup))) {
                    c1.j(this);
                    return true;
                }
                if (strQ.equals(L0(R.string.pref_restore_backup))) {
                    new b.a(m2()).h(R.string.restore_backup_dialog).o(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.r
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            this.f14018e.q3(dialogInterface, i2);
                        }
                    }).k(android.R.string.cancel, null).a().show();
                    return true;
                }
                if (strQ.equals(L0(R.string.pref_clear_geolocation_db))) {
                    d3();
                    return true;
                }
            }
        }
        return super.X(preference);
    }

    void e3() {
        this.s0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f13844e.k3();
            }
        });
    }

    void f3() {
        this.s0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f14007e.m3();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        if (context instanceof h) {
            this.z0 = (h) context;
            return;
        }
        throw new ClassCastException(context.toString() + " should implement ManageDatabaseFragment.Callback");
    }

    @Override // androidx.preference.g, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (!com.parizene.netmonitor.j0.g(m2(), g3())) {
            ((PreferenceCategory) ((PreferenceScreen) t(L0(R.string.pref_screen_manage_db))).G0(L0(R.string.pref_category_log_key))).N0(t(L0(R.string.pref_view_new_log_kml_key)));
        }
        this.r0.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(L0(R.string.pref_second_search_without_lac_key))) {
            this.x0.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
            this.n0.a(d.e.g(com.parizene.netmonitor.t0.f.f13728m.g().booleanValue()));
        } else if (str.equals(L0(R.string.pref_mark_second_search_info_key))) {
            this.x0.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
            this.n0.a(d.e.e(com.parizene.netmonitor.t0.f.n.g().booleanValue()));
        } else if (str.equals(L0(R.string.pref_clear_log_on_start_key))) {
            this.n0.a(d.e.d(com.parizene.netmonitor.t0.f.z.g().booleanValue()));
        } else if (str.equals(L0(R.string.pref_save_log_key))) {
            this.n0.a(d.e.f(com.parizene.netmonitor.t0.f.A.g().booleanValue()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        this.r0.unregisterOnSharedPreferenceChangeListener(this);
        super.q1();
    }

    @Override // androidx.fragment.app.Fragment
    public void t1() {
        super.t1();
        this.z0 = k0;
    }
}