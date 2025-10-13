package com.parizene.netmonitor.m0;

import android.os.Build;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TelephonyManagerUtils.java */
/* loaded from: classes.dex */
public class w {
    public static boolean a(int i2) {
        return i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 12 || i2 == 14;
    }

    public static boolean b(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 16;
    }

    public static boolean c(int i2) {
        return i2 == 13 || i2 == 19;
    }

    public static boolean d(int i2) {
        return i2 == 20;
    }

    public static boolean e(int i2) {
        return Build.VERSION.SDK_INT >= 29 && 17 == i2;
    }

    public static boolean f(int i2) {
        return i2 == 0;
    }

    public static boolean g(int i2) {
        if ((Build.VERSION.SDK_INT >= 29 || 17 != i2) && i2 != 3 && i2 != 15 && i2 != 18) {
            switch (i2) {
            }
            return true;
        }
        return true;
    }

    public static String h(int i2) {
        switch (i2) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "CDMA - EvDo rev. B";
            case 13:
                return "LTE";
            case 14:
                return "CDMA - eHRPD";
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return "HSPA+";
            case 16:
                return "GSM";
            case 17:
                return "TD-SCDMA";
            case 18:
                return "iWLAN";
            case 19:
                return "LTE CA";
            case 20:
                return "5G NR";
            default:
                return "UNKNOWN";
        }
    }

    public static String i(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "PHONE_TYPE_SIP" : "PHONE_TYPE_CDMA" : "PHONE_TYPE_GSM" : "PHONE_TYPE_NONE";
    }

    public static String j(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "POWER OFF" : "EMERGENCY ONLY" : "OUT OF SERVICE" : "IN SERVICE";
    }

    public static String k(int i2) {
        switch (i2) {
            case 1:
                return "SIM_STATE_ABSENT";
            case 2:
                return "SIM_STATE_PIN_REQUIRED";
            case 3:
                return "SIM_STATE_PUK_REQUIRED";
            case 4:
                return "SIM_STATE_NETWORK_LOCKED";
            case 5:
                return "SIM_STATE_READY";
            case 6:
                return "SIM_STATE_NOT_READY";
            case 7:
                return "SIM_STATE_PERM_DISABLED";
            case 8:
                return "SIM_STATE_CARD_IO_ERROR";
            case 9:
                return "SIM_STATE_CARD_RESTRICTED";
            default:
                return "UNKNOWN";
        }
    }
}