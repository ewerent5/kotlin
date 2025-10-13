package e.c.b.d.a.b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {
    private final String a;

    public f(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        String strValueOf = String.valueOf(sb.toString());
        String strValueOf2 = String.valueOf(str);
        this.a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private final int f(int i2, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i2)) {
            return Log.i("PlayCore", g(this.a, str, objArr));
        }
        return 0;
    }

    private static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e2);
                String strJoin = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(strJoin);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final void a(String str, Object... objArr) {
        f(3, str, objArr);
    }

    public final void b(String str, Object... objArr) {
        f(6, str, objArr);
    }

    public final void c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g(this.a, str, objArr), th);
        }
    }

    public final void d(String str, Object... objArr) {
        f(4, str, objArr);
    }

    public final void e(String str, Object... objArr) {
        f(5, str, objArr);
    }
}