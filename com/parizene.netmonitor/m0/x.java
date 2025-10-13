package com.parizene.netmonitor.m0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import android.widget.Toast;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.j0;
import com.parizene.netmonitor.m0.c0.c;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import okhttp3.internal.http.StatusLine;

/* compiled from: TestAll.java */
/* loaded from: classes.dex */
public class x {
    private final com.parizene.netmonitor.m0.d0.d a;

    /* renamed from: b */
    private final com.parizene.netmonitor.m0.d0.e f13525b;

    /* renamed from: c */
    private final com.parizene.netmonitor.m0.d0.a f13526c;

    /* renamed from: d */
    private final com.parizene.netmonitor.s0.d.c f13527d;

    /* renamed from: e */
    private final com.parizene.netmonitor.m0.c0.c f13528e;

    /* renamed from: f */
    private final Handler f13529f;

    /* renamed from: g */
    private final com.parizene.netmonitor.k f13530g;

    /* renamed from: h */
    private final SparseArray<a> f13531h = new SparseArray<>();

    /* compiled from: TestAll.java */
    private static class a extends com.parizene.netmonitor.m0.d0.b {

        /* renamed from: b */
        private final com.parizene.netmonitor.m0.d0.a f13532b;

        public a(int i2, com.parizene.netmonitor.m0.d0.a aVar) {
            super(i2);
            this.f13532b = aVar;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            x.b("{%d} onCellInfoChanged: %s", Integer.valueOf(this.a), list);
            x.b("{%d} onCellInfoChanged: %s", Integer.valueOf(this.a), this.f13532b.A(list));
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellLocationChanged(CellLocation cellLocation) {
            x.b("{%d} onCellLocationChanged: %s", Integer.valueOf(this.a), cellLocation);
            x.b("{%d} onCellLocationChanged: %s", Integer.valueOf(this.a), this.f13532b.p(cellLocation));
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            x.b("{%d} onServiceStateChanged: %s", Integer.valueOf(this.a), serviceState);
            x.b("{%d} onServiceStateChanged: %s", Integer.valueOf(this.a), this.f13532b.y(serviceState));
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthChanged(int i2) {
            x.b("{%d} onSignalStrengthChanged=%s", Integer.valueOf(this.a), Integer.valueOf(i2));
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            x.b("{%d} onSignalStrengthsChanged: %s", Integer.valueOf(this.a), signalStrength);
            x.b("{%d} onSignalStrengthsChanged: %s", Integer.valueOf(this.a), this.f13532b.z(signalStrength));
        }
    }

    public x(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.c0.c cVar, com.parizene.netmonitor.s0.d.c cVar2, Handler handler, com.parizene.netmonitor.k kVar) {
        this.a = dVar;
        this.f13525b = eVar;
        this.f13526c = aVar;
        this.f13528e = cVar;
        this.f13527d = cVar2;
        this.f13529f = handler;
        this.f13530g = kVar;
    }

    public static void b(String str, Object... objArr) {
        m.a.a.c(3, "__FILE__ " + str, objArr);
    }

    private Intent c(Context context, File file) {
        Intent intentD = j0.d("parizene@gmail.com", "Test log: " + Build.MANUFACTURER + " | " + Build.MODEL + " | " + Build.DEVICE, "");
        intentD.setType("plain/text");
        intentD.putExtra("android.intent.extra.STREAM", this.f13530g.d(file));
        intentD.addFlags(1);
        return intentD;
    }

    private static void d(String str, Object... objArr) {
        m.a.a.c(4, "__FILE__ " + str, objArr);
    }

    /* renamed from: e */
    public /* synthetic */ void f(com.parizene.netmonitor.s sVar, Context context, File file) throws IllegalAccessException, IllegalArgumentException {
        k();
        m.a.a.e(sVar);
        i(context, file);
    }

    private void g(int i2) {
        SubscriptionInfo subscriptionInfoC;
        int iH;
        d(">>> subscriptionId=%s", Integer.valueOf(i2));
        int iG = this.f13525b.g(i2);
        int iC = this.f13525b.c(i2);
        int i3 = this.f13525b.i(i2);
        String strE = this.f13525b.e(i2);
        String strF = this.f13525b.f(i2);
        boolean zJ = this.f13525b.j(i2);
        int iX = this.a.x(i2);
        if (-1 != iX) {
            iH = this.f13525b.h(iX);
            subscriptionInfoC = this.a.c(iX);
        } else {
            subscriptionInfoC = null;
            iH = 0;
        }
        d("networkType=%s", w.h(iG));
        d("dataNetworkType=%s", w.h(iC));
        d("voiceNetworkType=%s", w.h(i3));
        d("networkOperator=%s", strE);
        d("networkOperatorName=%s", strF);
        d("isNetworkRoaming=%s", Boolean.valueOf(zJ));
        d("slotIndex=%d", Integer.valueOf(iX));
        d("simState=%s", w.k(iH));
        d("subscriptionInfo=%s", subscriptionInfoC);
        if (Integer.MAX_VALUE == i2 || this.a.B()) {
            CellLocation cellLocationB = this.f13525b.b(i2);
            d("cellLocation: %s", cellLocationB);
            d("wrap(cellLocation): %s", this.f13526c.p(cellLocationB));
        }
        if (Integer.MAX_VALUE == i2) {
            List<NeighboringCellInfo> listD = this.f13525b.d(i2);
            d("neighboringCellInfos: %s", listD);
            d("wrap(neighboringCellInfos): %s", this.f13526c.B(listD));
        }
        if (Integer.MAX_VALUE == i2 || this.a.A()) {
            List<CellInfo> listA = this.f13525b.a(i2);
            List<com.parizene.netmonitor.m0.d0.f.o> listA2 = this.f13526c.A(listA);
            d("cellInfos: %s", listA);
            d("wrap(cellInfos): %s", listA2);
            c.d dVarD = this.f13528e.d(listA2, com.parizene.netmonitor.m0.c0.c.a.b());
            List<com.parizene.netmonitor.m0.c0.d> listA3 = dVarD.a();
            b("split: isRegisteredCount=%d, timestampMillis=%s, mccMnc=%s, [", Integer.valueOf(dVarD.d()), dVarD.c(), dVarD.b());
            int size = listA3.size();
            for (int i4 = 0; i4 < size; i4++) {
                List<com.parizene.netmonitor.m0.c0.f> listC = listA3.get(i4).c();
                b("%d: size=%d %s", Integer.valueOf(i4), Integer.valueOf(listC.size()), listC);
            }
            b("]", new Object[0]);
        }
        d("<<<", new Object[0]);
    }

    private static void h() throws SecurityException {
        String[] strArr = {"SimState", "NetworkOperator", "NetworkType", "CellLocation", "CellInfo", "listen"};
        for (Method method : TelephonyManager.class.getDeclaredMethods()) {
            for (int i2 = 0; i2 < 6; i2++) {
                String str = strArr[i2];
                String string = method.toString();
                if (string.contains(str) && !string.contains("set")) {
                    b(string, new Object[0]);
                }
            }
        }
    }

    private void i(Context context, File file) {
        if (file.exists()) {
            context.startActivity(Intent.createChooser(c(context, file), "Send email"));
        } else {
            Toast.makeText(context, R.string.no_log_file, 0).show();
        }
    }

    public void j() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        d("start", new Object[0]);
        b("VERSION_NAME=%s, VERSION_CODE=%s, SDK_INT=%s, MANUFACTURER=%s, MODEL=%s, DEVICE=%s", "1.10.2", Integer.valueOf(StatusLine.HTTP_TEMP_REDIRECT), Integer.valueOf(Build.VERSION.SDK_INT), Build.MANUFACTURER, Build.MODEL, Build.DEVICE);
        b(">>> METHODS", new Object[0]);
        h();
        b("<<<", new Object[0]);
        b("locationStatus=%s", this.f13527d.o());
        b("isGetCellLocationSupported=%s", Boolean.valueOf(this.a.B()));
        b("isGetAllCellInfoSupported=%s", Boolean.valueOf(this.a.A()));
        int iT = this.a.t();
        b("phoneCount=%d, phoneType=%s", Integer.valueOf(iT), w.i(this.a.u()));
        int[] iArrB = this.a.b();
        int iK = this.a.k();
        int iJ = this.a.j();
        b("activeSubscriptionIdList=%s, defaultSubscriptionId=%d, defaultDataSubscriptionId=%d", Arrays.toString(iArrB), Integer.valueOf(iK), Integer.valueOf(iJ));
        for (int i2 = 0; i2 < iT; i2++) {
            b("slotIndex=%d: %s", Integer.valueOf(i2), this.a.c(i2));
        }
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(Integer.MAX_VALUE);
        hashSet.add(Integer.valueOf(iK));
        hashSet.add(Integer.valueOf(iJ));
        if (iArrB != null) {
            for (int i3 : iArrB) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        for (Integer num : hashSet) {
            g(num.intValue());
            a aVar = new a(num.intValue(), this.f13526c);
            this.f13531h.put(num.intValue(), aVar);
            this.f13525b.k(aVar, 1299, num.intValue());
        }
    }

    public void k() throws IllegalAccessException, IllegalArgumentException {
        int size = this.f13531h.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVarValueAt = this.f13531h.valueAt(i2);
            this.f13525b.k(aVarValueAt, 0, aVarValueAt.a());
        }
        d("stop", new Object[0]);
    }

    public void l(final Context context) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Toast.makeText(context, "Testing 5 seconds, please wait...", 1).show();
        final File fileE = this.f13530g.e();
        fileE.delete();
        final com.parizene.netmonitor.s sVar = new com.parizene.netmonitor.s(fileE);
        m.a.a.d(sVar);
        j();
        this.f13529f.postDelayed(new Runnable() { // from class: com.parizene.netmonitor.m0.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                this.f13324e.f(sVar, context, fileE);
            }
        }, 5000L);
    }
}