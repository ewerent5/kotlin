package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ev2 {
    public static final nx2 a = new dv2();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f5725b = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: c, reason: collision with root package name */
    public int f5726c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f5727d = -1;

    public final boolean a(hx2 hx2Var) throws NumberFormatException {
        for (int i2 = 0; i2 < hx2Var.a(); i2++) {
            gx2 gx2VarB = hx2Var.b(i2);
            if (gx2VarB instanceof mx2) {
                mx2 mx2Var = (mx2) gx2VarB;
                String str = mx2Var.f7583g;
                String str2 = mx2Var.f7584h;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f5725b.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i3 = Integer.parseInt(matcher.group(1), 16);
                            int i4 = Integer.parseInt(matcher.group(2), 16);
                            if (i3 > 0 || i4 > 0) {
                                this.f5726c = i3;
                                this.f5727d = i4;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final boolean b() {
        return (this.f5726c == -1 || this.f5727d == -1) ? false : true;
    }
}