package com.parizene.netmonitor.ui.map;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: CombinedCell.java */
/* loaded from: classes3.dex */
public class s {
    private List<com.parizene.netmonitor.db.celllog.i.e> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f13980b = 0;

    /* renamed from: c, reason: collision with root package name */
    public b0 f13981c;

    /* renamed from: d, reason: collision with root package name */
    private g0 f13982d;

    /* renamed from: e, reason: collision with root package name */
    private String f13983e;

    /* renamed from: f, reason: collision with root package name */
    private String f13984f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f13985g;

    public s(com.parizene.netmonitor.db.celllog.i.e eVar) {
        a(eVar);
    }

    private static String c(int i2, boolean z, long j2, int i3) {
        if (5 == i3 || 6 == i3) {
            return String.valueOf(j2);
        }
        if (1 == i3) {
            if (!z) {
                return String.valueOf((int) j2);
            }
            return (((int) j2) >> 8) + " x";
        }
        if (i2 == 1) {
            return (((int) j2) / 10) + "x";
        }
        if (i2 == 2) {
            return "x" + (((int) j2) % 10000);
        }
        if (i2 == 3) {
            return String.format("%03Xx", Integer.valueOf((((int) j2) >> 4) & 4095));
        }
        if (i2 != 4) {
            return String.valueOf((int) j2);
        }
        int i4 = (int) j2;
        return String.format("%01Xx%02X", Integer.valueOf((i4 >> 12) & 15), Integer.valueOf(i4 & 255));
    }

    private String d(g0 g0Var) {
        if (g0Var == null) {
            return "? (m)";
        }
        float[] fArr = new float[3];
        g0 g0VarF = f();
        Location.distanceBetween(g0Var.a(), g0Var.b(), g0VarF.a(), g0VarF.b(), fArr);
        return String.format("%.2f (m)", Float.valueOf(fArr[0]));
    }

    private static String g(int i2, boolean z, long j2, int i3) {
        if (5 == i3 || 6 == i3) {
            return null;
        }
        if (1 == i3) {
            if (z) {
                return String.valueOf(((int) j2) & 255);
            }
            return null;
        }
        if (i2 == 1) {
            return String.valueOf(((int) j2) % 10);
        }
        if (i2 == 2) {
            return String.valueOf(((int) j2) / 10000);
        }
        if (i2 == 3) {
            return String.valueOf(((int) j2) & 15);
        }
        if (i2 != 4) {
            return null;
        }
        return String.valueOf((((int) j2) >> 8) & 15);
    }

    static /* synthetic */ int j(com.parizene.netmonitor.db.celllog.i.b bVar, com.parizene.netmonitor.db.celllog.i.b bVar2) {
        return (int) (bVar.f13091e - bVar2.f13091e);
    }

    public void a(com.parizene.netmonitor.db.celllog.i.e eVar) {
        this.a.add(eVar);
        Collections.sort(this.a, b.f13938e);
    }

    public int b() {
        if (this.f13985g == null) {
            if (this.a.size() == 1) {
                this.f13985g = Integer.valueOf(this.a.get(0).c());
            } else {
                this.f13985g = 0;
            }
        }
        return this.f13985g.intValue();
    }

    public String e(int i2, boolean z) {
        com.parizene.netmonitor.db.celllog.i.e eVar = this.a.get(0);
        return eVar.f13090d + "/" + c(i2, z, eVar.a(), eVar.f13097k);
    }

    public g0 f() {
        if (this.f13982d == null) {
            Iterator<com.parizene.netmonitor.db.celllog.i.e> it = this.a.iterator();
            double latitude = 0.0d;
            double longitude = 0.0d;
            while (it.hasNext()) {
                Location locationF = it.next().f();
                if (locationF != null) {
                    latitude += locationF.getLatitude() / this.a.size();
                    longitude += locationF.getLongitude() / this.a.size();
                }
            }
            this.f13982d = new g0((int) (latitude * 1000000.0d), (int) (longitude * 1000000.0d));
        }
        return this.f13982d;
    }

    public String h() {
        if (this.f13984f == null) {
            this.f13984f = this.a.get(0).d();
        }
        return this.f13984f;
    }

    public String i(g0 g0Var, int i2, boolean z) {
        if (this.f13983e == null) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < this.a.size(); i3++) {
                com.parizene.netmonitor.db.celllog.i.e eVar = this.a.get(i3);
                String strG = g(i2, z, eVar.a(), eVar.f13097k);
                if (i3 == 0) {
                    sb.append(eVar.f13088b);
                    sb.append(" ");
                    sb.append(eVar.f13089c);
                    int i4 = eVar.f13097k;
                    if (1 == i4) {
                        sb.append(" lte");
                    } else if (2 == i4) {
                        sb.append(" wcdma");
                    } else if (3 == i4) {
                        sb.append(" gsm");
                    } else if (4 == i4) {
                        sb.append(" cdma");
                    } else if (5 == i4) {
                        sb.append(" tdscdma");
                    } else if (6 == i4) {
                        sb.append(" nr");
                    }
                    sb.append(" | ");
                    if (TextUtils.isEmpty(strG)) {
                        break;
                    }
                    sb.append(" x=[");
                } else {
                    sb.append(",");
                }
                sb.append(strG);
                if (i3 == this.a.size() - 1) {
                    sb.append("] ");
                }
            }
            sb.append(d(g0Var));
            this.f13983e = sb.toString();
        }
        return this.f13983e;
    }

    public void k(int i2) {
        int i3 = this.f13980b;
        if (!(i3 == 2 && i2 == 1) && (i3 != 0 || i2 == 0)) {
            return;
        }
        this.f13980b = i2;
    }
}