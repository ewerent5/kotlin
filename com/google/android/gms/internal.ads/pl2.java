package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class pl2 {
    static String a(ci2 ci2Var) {
        StringBuilder sb = new StringBuilder(ci2Var.l());
        for (int i2 = 0; i2 < ci2Var.l(); i2++) {
            byte bH = ci2Var.h(i2);
            if (bH == 34) {
                sb.append("\\\"");
            } else if (bH == 39) {
                sb.append("\\'");
            } else if (bH != 92) {
                switch (bH) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bH < 32 || bH > 126) {
                            sb.append(CoreConstants.ESCAPE_CHAR);
                            sb.append((char) (((bH >>> 6) & 3) + 48));
                            sb.append((char) (((bH >>> 3) & 7) + 48));
                            sb.append((char) ((bH & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bH);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}