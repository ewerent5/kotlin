package com.parizene.netmonitor.db.celllog;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.a0;
import com.parizene.netmonitor.db.celllog.i.i;
import com.parizene.netmonitor.k;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class ExportCellService extends IntentService {

    /* renamed from: e, reason: collision with root package name */
    private String f13042e;

    /* renamed from: f, reason: collision with root package name */
    private String f13043f;

    /* renamed from: g, reason: collision with root package name */
    private int f13044g;

    /* renamed from: h, reason: collision with root package name */
    private int f13045h;

    /* renamed from: i, reason: collision with root package name */
    private int f13046i;

    /* renamed from: j, reason: collision with root package name */
    b f13047j;

    /* renamed from: k, reason: collision with root package name */
    a0 f13048k;

    /* renamed from: l, reason: collision with root package name */
    k f13049l;

    public ExportCellService() {
        super("export_cell");
    }

    private static com.parizene.netmonitor.n0.c a(i iVar) {
        return new com.parizene.netmonitor.n0.c(iVar.a, iVar.f13112b, iVar.f13113c, iVar.f13114d, iVar.f13115e, iVar.f13116f, iVar.f13117g);
    }

    private int b(com.parizene.netmonitor.n0.e eVar, BufferedWriter bufferedWriter) throws IOException {
        long j2 = 0;
        long j3 = 0;
        while (true) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j2 == 0 || jElapsedRealtime >= 200 + j2) {
                c(this.f13044g);
                j2 = jElapsedRealtime;
            }
            List<i> listS = this.f13047j.s(this.f13042e, this.f13043f, j3, 500L);
            int size = listS.size();
            if (size <= 0) {
                bufferedWriter.close();
                return 0;
            }
            for (int i2 = 0; i2 < size; i2++) {
                String strF = com.parizene.netmonitor.n0.a.f(a(listS.get(i2)), eVar);
                if (strF != null) {
                    bufferedWriter.write(strF);
                    bufferedWriter.newLine();
                }
            }
            this.f13044g += size;
            j3 += 500;
        }
    }

    private void c(int i2) {
        this.f13048k.i(551, this.f13048k.d(false, this.f13046i, i2));
    }

    private void d(int i2) {
        this.f13048k.i(551, this.f13048k.b(false, i2 != -1 ? i2 != 0 ? "" : getString(R.string.export_cell_result, new Object[]{Integer.valueOf(this.f13044g), Integer.valueOf(this.f13045h)}) : getString(R.string.export_cell_check_file_error)));
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        f.b.a.b(this);
        super.onCreate();
        m.a.a.a("", new Object[0]);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) throws IOException {
        this.f13044g = 0;
        this.f13042e = intent.getStringExtra("mcc");
        this.f13043f = intent.getStringExtra("mnc");
        com.parizene.netmonitor.n0.e eVar = (com.parizene.netmonitor.n0.e) intent.getSerializableExtra("clf_type");
        int iB = -1;
        if (this.f13042e == null || this.f13043f == null || eVar == null) {
            d(-1);
            return;
        }
        File file = new File(this.f13049l.b(), this.f13042e + this.f13043f + ".clf");
        this.f13046i = this.f13047j.q(this.f13042e, this.f13043f);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
            } catch (IOException e2) {
                m.a.a.g(e2);
            }
            try {
                try {
                    iB = b(eVar, bufferedWriter);
                    bufferedWriter.close();
                } catch (IOException e3) {
                    m.a.a.g(e3);
                    bufferedWriter.close();
                }
                if (iB == 0) {
                    this.f13045h = (int) ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000);
                }
                d(iB);
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (IOException e4) {
                    m.a.a.g(e4);
                }
                throw th;
            }
        } catch (IOException e5) {
            m.a.a.g(e5);
            d(-1);
        }
    }
}