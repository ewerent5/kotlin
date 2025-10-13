package com.parizene.netmonitor.db.celllog;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.format.DateFormat;
import android.widget.Toast;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.a0;
import com.parizene.netmonitor.k;
import com.parizene.netmonitor.ui.HomeActivity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

/* compiled from: LogClfExportTask.java */
/* loaded from: classes.dex */
public class g extends AsyncTask<Void, Long, Long> {
    private Context a;

    /* renamed from: b */
    private a0 f13068b;

    /* renamed from: c */
    private b f13069c;

    /* renamed from: d */
    private final k f13070d;

    /* renamed from: e */
    private com.parizene.netmonitor.db.celllog.i.g f13071e;

    /* renamed from: f */
    private long f13072f;

    /* renamed from: g */
    private boolean f13073g;

    /* renamed from: h */
    private boolean f13074h;

    /* renamed from: i */
    private Runnable f13075i = new a();

    /* compiled from: LogClfExportTask.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            if (!g.this.f13070d.a()) {
                return;
            }
            try {
                String string = DateFormat.format("yyyyMMdd_kkmm", Calendar.getInstance()).toString();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(g.this.f13070d.b(), "cell_log_" + g.this.f13071e + "_" + string + ".clf"), false));
                float f2 = 0.05f;
                long j2 = 0L;
                long j3 = 0L;
                while (true) {
                    List<com.parizene.netmonitor.db.celllog.i.f> listO = g.this.f13069c.o(j2, 500L, g.this.f13071e, g.this.f13073g, g.this.f13074h);
                    if (listO.size() <= 0) {
                        bufferedWriter.close();
                        return;
                    }
                    long size = listO.size() + j3;
                    for (int i2 = 0; i2 < listO.size(); i2++) {
                        bufferedWriter.write(g.i(listO.get(i2)).a());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                    if (size / g.this.f13072f > f2) {
                        g.this.publishProgress(Long.valueOf(size));
                        f2 = (float) (f2 + 0.05d);
                    }
                    j2 += 500;
                    j3 = size;
                }
            } catch (Exception e2) {
                m.a.a.g(e2);
            }
        }
    }

    public g(Context context, a0 a0Var, b bVar, k kVar, com.parizene.netmonitor.db.celllog.i.g gVar, long j2, boolean z, boolean z2) {
        this.a = context;
        this.f13068b = a0Var;
        this.f13069c = bVar;
        this.f13070d = kVar;
        this.f13071e = gVar;
        this.f13072f = j2;
        this.f13073g = z;
        this.f13074h = z2;
    }

    public static com.parizene.netmonitor.n0.d i(com.parizene.netmonitor.db.celllog.i.f fVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fVar.A);
        String string = DateFormat.format("yyyyMMdd", calendar).toString();
        String string2 = DateFormat.format("kkmmss", calendar).toString();
        String str = fVar.f13088b;
        String str2 = fVar.f13089c;
        int i2 = fVar.f13090d;
        long jA = fVar.a();
        String strValueOf = fVar.b() != 0 ? String.valueOf(fVar.b()) : "-";
        int i3 = fVar.w;
        return new com.parizene.netmonitor.n0.d(string, string2, jA, i2, strValueOf, str, str2, fVar.x / 1000000.0d, fVar.y / 1000000.0d, i3 != -1 ? i3 : 99, fVar.d());
    }

    @Override // android.os.AsyncTask
    /* renamed from: j */
    public Long doInBackground(Void... voidArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        publishProgress(0L);
        this.f13075i.run();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Calendar.getInstance().setTimeInMillis(jCurrentTimeMillis2 - jCurrentTimeMillis);
        return Long.valueOf((r5.get(12) * 60) + r5.get(13));
    }

    @Override // android.os.AsyncTask
    /* renamed from: k */
    public void onPostExecute(Long l2) {
        String string = this.a.getString(R.string.export_finished, "CLF");
        String string2 = this.a.getString(R.string.progress_result, Long.valueOf(this.f13072f), l2);
        Intent intent = new Intent(this.a, (Class<?>) HomeActivity.class);
        Toast.makeText(this.a, string + "\n" + string2, 1).show();
        this.f13068b.i(200, this.f13068b.c(string, string2, intent));
    }

    @Override // android.os.AsyncTask
    /* renamed from: l */
    public void onProgressUpdate(Long... lArr) {
        long jLongValue = lArr[0].longValue();
        long j2 = this.f13072f;
        if (jLongValue > j2) {
            lArr[0] = Long.valueOf(j2);
        }
        this.f13068b.i(200, this.f13068b.e(this.a.getString(R.string.exporting, "CLF"), lArr[0] + "/" + this.f13072f, this.f13072f, lArr[0].longValue(), new Intent(this.a, (Class<?>) HomeActivity.class)));
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Context context = this.a;
        Toast.makeText(context, context.getString(R.string.export_started, "CLF"), 0).show();
    }
}