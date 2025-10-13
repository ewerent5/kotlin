package com.parizene.netmonitor.db.celllog;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.AsyncTask;
import android.widget.Toast;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.a0;
import com.parizene.netmonitor.db.celllog.i.l;
import com.parizene.netmonitor.j0;
import com.parizene.netmonitor.k;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.HomeActivity;
import com.parizene.netmonitor.ui.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

/* compiled from: LogKmlExportTask.java */
/* loaded from: classes.dex */
public class h extends AsyncTask<Void, Long, Long> {
    private Context a;

    /* renamed from: b */
    private a0 f13077b;

    /* renamed from: c */
    private b f13078c;

    /* renamed from: d */
    private com.parizene.netmonitor.m0.d0.d f13079d;

    /* renamed from: e */
    private final k f13080e;

    /* renamed from: f */
    private long f13081f;

    /* renamed from: g */
    private long f13082g;

    /* renamed from: h */
    private long f13083h;

    /* renamed from: i */
    private boolean f13084i;

    /* renamed from: j */
    private boolean f13085j;

    /* renamed from: k */
    private Runnable f13086k = new a();

    /* compiled from: LogKmlExportTask.java */
    class a implements Runnable {
        a() {
        }

        private String a(int i2, int i3) {
            int[] iArrA = 4 == i3 ? n.a(o.Cdma) : 2 == i3 ? n.a(o.Wcdma) : 1 == i3 ? n.a(o.Lte) : 5 == i3 ? n.a(o.Tdscdma) : 6 == i3 ? n.a(o.Nr) : n.a(o.Gsm);
            int i4 = iArrA[0];
            int i5 = iArrA[1];
            if (i2 == -1) {
                return "style_0";
            }
            if (i2 > i5) {
                i2 = i5;
            } else if (i2 < i4) {
                i2 = i4;
            }
            return b(Math.round(((i2 - i4) / (i5 - i4)) * 10.0f) * 10);
        }

        private String b(int i2) {
            return "style_" + i2;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            p0 p0Var;
            boolean z;
            long j2;
            float f2;
            String str = "style_neigh";
            String str2 = "style_cur";
            if (!h.this.f13080e.a()) {
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(h.this.f13080e.b(), "cell_log.kml"), false);
                f fVar = new f(fileOutputStream);
                fVar.l();
                fVar.j(h.this.a.getString(R.string.app_name), true);
                fVar.c("styletp", "ff000000", "1.4", "ffffffff", "0.2");
                fVar.a("style_cur", "ff00ff00", "0.8", "http://www.gstatic.com/mapspro/images/stock/962-wht-diamond-blank.png");
                fVar.a("style_neigh", "ff00ffff", "0.8", "http://www.gstatic.com/mapspro/images/stock/962-wht-diamond-blank.png");
                fVar.a("style_0", "ffffffff", "0.6", "http://www.gstatic.com/mapspro/images/stock/959-wht-circle-blank.png");
                for (int i2 = 10; i2 <= 100; i2 += 10) {
                    fVar.a(b(i2), f.e(j0.e(i2 / 100.0f)), "0.6", "http://www.gstatic.com/mapspro/images/stock/959-wht-circle-blank.png");
                }
                p0 p0Var2 = p0.values()[com.parizene.netmonitor.t0.f.f13717b.f().intValue()];
                boolean zBooleanValue = com.parizene.netmonitor.t0.f.f13724i.g().booleanValue();
                float f3 = 0.05f;
                long jM = h.this.f13078c.m();
                String str3 = null;
                int i3 = 0;
                long j3 = 1;
                while (true) {
                    List<com.parizene.netmonitor.db.celllog.i.e> listP = h.this.f13078c.p(i3, 500L, h.this.f13084i, h.this.f13085j);
                    if (listP.isEmpty()) {
                        break;
                    }
                    int i4 = i3 + 500;
                    String str4 = str;
                    int i5 = 0;
                    long j4 = j3;
                    while (i5 < listP.size()) {
                        com.parizene.netmonitor.db.celllog.i.e eVar = listP.get(i5);
                        String str5 = str2;
                        int i6 = eVar.f13097k;
                        FileOutputStream fileOutputStream2 = fileOutputStream;
                        boolean z2 = 4 == i6 || (i6 == 0 && h.this.f13079d.u() == 2);
                        StringBuilder sb = new StringBuilder();
                        List<com.parizene.netmonitor.db.celllog.i.e> list = listP;
                        sb.append("MCC: ");
                        sb.append(eVar.f13088b);
                        sb.append(!z2 ? " MNC: " : " SID: ");
                        sb.append(eVar.f13089c);
                        String string = sb.toString();
                        if (str3 != null && !str3.equals(string)) {
                            fVar.h();
                        }
                        if (str3 == null || !str3.equals(string)) {
                            fVar.k(string, true);
                            str3 = string;
                        }
                        String str6 = str3;
                        String strA = p0.a(eVar.f13091e, eVar.f13097k, p0Var2, zBooleanValue);
                        String str7 = z2 ? "NID: " + eVar.f13090d + " BID: " + strA + " LAT: " + eVar.f13093g + " LON: " + eVar.f13094h : "LAC: " + eVar.f13090d + " CID: " + strA + " RNC: " + eVar.b() + " PSC: " + eVar.f13092f;
                        fVar.k(str7, false);
                        Location locationF = eVar.f();
                        if (locationF != null) {
                            String strValueOf = String.valueOf(locationF.getLatitude());
                            String strValueOf2 = String.valueOf(locationF.getLongitude());
                            p0Var = p0Var2;
                            StringBuilder sb2 = new StringBuilder();
                            z = zBooleanValue;
                            sb2.append(eVar.f13090d);
                            sb2.append("/");
                            j2 = jM;
                            sb2.append(eVar.a());
                            String string2 = sb2.toString();
                            int i7 = eVar.f13097k;
                            if (z2) {
                                string2 = string2 + " CDMA";
                            } else if (3 == i7) {
                                string2 = string2 + " GSM";
                            } else if (2 == i7) {
                                string2 = string2 + " WCDMA";
                            } else if (1 == i7) {
                                string2 = string2 + " LTE";
                            } else if (5 == i7) {
                                string2 = string2 + " TDSCDMA";
                            } else if (6 == i7) {
                                string2 = string2 + " NR";
                            }
                            fVar.d(string2, eVar.d(), eVar.f13095i ? str5 : str4, strValueOf2 + "," + strValueOf);
                        } else {
                            p0Var = p0Var2;
                            z = zBooleanValue;
                            j2 = jM;
                        }
                        if (eVar.f13095i) {
                            List<l> listW = h.this.f13078c.w(eVar.a, h.this.f13081f, h.this.f13082g);
                            if (listW.size() > 0) {
                                int i8 = 0;
                                while (i8 < listW.size()) {
                                    l lVar = listW.get(i8);
                                    String strValueOf3 = String.valueOf(lVar.f13132f / 1000000.0d);
                                    String strValueOf4 = String.valueOf(lVar.f13131e / 1000000.0d);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("\n");
                                    sb3.append(str7);
                                    sb3.append("\nACCURACY: ");
                                    sb3.append(lVar.f13133g);
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(lVar.f13134h);
                                    sb3.append("\nCHANGE_TYPE: ");
                                    sb3.append(lVar.f13129c);
                                    sb3.append("\nTIMESTAMP: ");
                                    sb3.append(calendar.getTime().toLocaleString());
                                    fVar.d(String.valueOf(lVar.f13130d), sb3.toString(), a(lVar.f13130d, eVar.f13097k), strValueOf3 + "," + strValueOf4);
                                    i8++;
                                    f3 = f3;
                                    str7 = str7;
                                }
                            }
                        }
                        float f4 = f3;
                        fVar.h();
                        long j5 = j2;
                        if (j4 / j5 > f4) {
                            h hVar = h.this;
                            hVar.publishProgress(Long.valueOf((hVar.f13083h * j4) / j5));
                            f2 = (float) (f4 + 0.05d);
                        } else {
                            f2 = f4;
                        }
                        j4++;
                        i5++;
                        f3 = f2;
                        jM = j5;
                        str2 = str5;
                        listP = list;
                        fileOutputStream = fileOutputStream2;
                        str3 = str6;
                        p0Var2 = p0Var;
                        zBooleanValue = z;
                    }
                    str = str4;
                    p0Var2 = p0Var2;
                    long j6 = j4;
                    i3 = i4;
                    j3 = j6;
                }
                long size = 0;
                if (jM > 0) {
                    fVar.h();
                }
                StringBuilder sb4 = new StringBuilder();
                int i9 = 0;
                while (true) {
                    List<l> listV = h.this.f13078c.v(i9, 500L, h.this.f13081f, h.this.f13082g);
                    if (listV.isEmpty()) {
                        fVar.b("Timestamp Path", "styletp", sb4.toString());
                        fVar.g();
                        fVar.i();
                        fVar.f();
                        fileOutputStream.close();
                        return;
                    }
                    i9 += 500;
                    size += listV.size();
                    for (int i10 = 0; i10 < listV.size(); i10++) {
                        String strValueOf5 = String.valueOf(listV.get(i10).f13132f / 1000000.0d);
                        String strValueOf6 = String.valueOf(listV.get(i10).f13131e / 1000000.0d);
                        sb4.append(strValueOf5);
                        sb4.append(",");
                        sb4.append(strValueOf6);
                        sb4.append(" ");
                    }
                    h.this.publishProgress(Long.valueOf(size));
                }
            } catch (Exception e2) {
                m.a.a.g(e2);
            }
        }
    }

    public h(Context context, a0 a0Var, b bVar, com.parizene.netmonitor.m0.d0.d dVar, k kVar, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = context;
        this.f13077b = a0Var;
        this.f13078c = bVar;
        this.f13079d = dVar;
        this.f13080e = kVar;
        this.f13081f = j2;
        this.f13082g = j3;
        this.f13083h = j4;
        this.f13084i = z;
        this.f13085j = z2;
    }

    @Override // android.os.AsyncTask
    /* renamed from: l */
    public Long doInBackground(Void... voidArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        publishProgress(0L);
        this.f13086k.run();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Calendar.getInstance().setTimeInMillis(jCurrentTimeMillis2 - jCurrentTimeMillis);
        return Long.valueOf((r5.get(12) * 60) + r5.get(13));
    }

    @Override // android.os.AsyncTask
    /* renamed from: m */
    public void onPostExecute(Long l2) {
        String string = this.a.getString(R.string.export_finished, "KML");
        String string2 = this.a.getString(R.string.progress_result, Long.valueOf(this.f13083h), l2);
        Intent intent = new Intent(this.a, (Class<?>) HomeActivity.class);
        Toast.makeText(this.a, string + "\n" + string2, 1).show();
        this.f13077b.i(300, this.f13077b.c(string, string2, intent));
    }

    @Override // android.os.AsyncTask
    /* renamed from: n */
    public void onProgressUpdate(Long... lArr) {
        long jLongValue = lArr[0].longValue();
        long j2 = this.f13083h;
        if (jLongValue > j2) {
            lArr[0] = Long.valueOf(j2);
        }
        this.f13077b.i(300, this.f13077b.e(this.a.getString(R.string.exporting, "KML"), lArr[0] + "/" + this.f13083h, this.f13083h, lArr[0].longValue(), new Intent(this.a, (Class<?>) HomeActivity.class)));
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Context context = this.a;
        Toast.makeText(context, context.getString(R.string.export_started, "KML"), 0).show();
    }
}