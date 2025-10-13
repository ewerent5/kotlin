package com.parizene.netmonitor.db.celllog;

import android.app.IntentService;
import android.content.Intent;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.a0;
import com.parizene.netmonitor.db.celllog.i.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ImportCellService extends IntentService {

    /* renamed from: e, reason: collision with root package name */
    private int f13050e;

    /* renamed from: f, reason: collision with root package name */
    private int f13051f;

    /* renamed from: g, reason: collision with root package name */
    private int f13052g;

    /* renamed from: h, reason: collision with root package name */
    b f13053h;

    /* renamed from: i, reason: collision with root package name */
    a0 f13054i;

    /* renamed from: j, reason: collision with root package name */
    c.p.a.a f13055j;

    public ImportCellService() {
        super("import_cell");
    }

    private int a(com.parizene.netmonitor.n0.e eVar, BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        float f2 = 0.1f;
        int length = 0;
        int i2 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                if (!arrayList.isEmpty()) {
                    this.f13053h.i(arrayList);
                    arrayList.clear();
                }
                return 0;
            }
            length += line.getBytes().length + 2;
            if (length / this.f13052g > f2) {
                b(length);
                f2 = (float) (f2 + 0.1d);
            }
            com.parizene.netmonitor.n0.c cVarF = com.parizene.netmonitor.n0.b.f(line, eVar);
            if (cVarF == null) {
                i2++;
                if (i2 == 25) {
                    return -2;
                }
            } else if (cVarF.l() || cVarF.k()) {
                arrayList.add(new i(cVarF.i(), cVarF.j(), cVarF.d(), cVarF.a(), cVarF.e(), cVarF.g(), cVarF.b()));
                this.f13050e++;
            }
            if (arrayList.size() == 500) {
                this.f13053h.i(arrayList);
                arrayList.clear();
            }
        }
    }

    private void b(int i2) {
        this.f13054i.i(400, this.f13054i.d(true, this.f13052g, i2));
    }

    private void c(int i2) {
        String string;
        if (i2 == -2) {
            string = getString(R.string.import_cell_max_errors);
        } else if (i2 == -1) {
            string = getString(R.string.import_cell_check_file_error);
        } else if (i2 != 0) {
            string = "";
        } else {
            string = getString(R.string.import_cell_result, new Object[]{Integer.valueOf(this.f13050e), Integer.valueOf(this.f13051f)});
            this.f13055j.d(new Intent("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
        }
        this.f13054i.i(400, this.f13054i.b(true, string));
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        f.b.a.b(this);
        super.onCreate();
        m.a.a.a("", new Object[0]);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) throws IOException {
        this.f13050e = 0;
        String stringExtra = intent.getStringExtra("path");
        com.parizene.netmonitor.n0.e eVar = (com.parizene.netmonitor.n0.e) intent.getSerializableExtra("clf_type");
        int iA = -1;
        if (stringExtra == null || eVar == null) {
            c(-1);
            return;
        }
        File file = new File(stringExtra);
        this.f13052g = (int) file.length();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            long jCurrentTimeMillis = System.currentTimeMillis();
            b(0);
            try {
            } catch (IOException e2) {
                m.a.a.g(e2);
            }
            try {
                try {
                    iA = a(eVar, bufferedReader);
                    bufferedReader.close();
                } catch (IOException e3) {
                    m.a.a.g(e3);
                    bufferedReader.close();
                }
                if (iA == 0) {
                    b(this.f13052g);
                    this.f13051f = (int) ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000);
                }
                c(iA);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    m.a.a.g(e4);
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
            m.a.a.g(e5);
            c(-1);
        }
    }
}