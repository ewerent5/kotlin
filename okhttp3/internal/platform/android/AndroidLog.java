package okhttp3.internal.platform.android;

import android.util.Log;
import i.d0.q;
import i.d0.s;
import i.t.c0;
import i.y.d.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* compiled from: AndroidLog.kt */
@SuppressSignatureCheck
/* loaded from: classes3.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = OkHttpClient.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        l.c(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        l.c(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        l.c(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = c0.i(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            l.c(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 != null ? str2 : s.D0(str, 23);
    }

    public final void androidLog$okhttp(String str, int i2, String str2, Throwable th) {
        int iMin;
        l.d(str, "loggerName");
        l.d(str2, "message");
        String strLoggerTag = loggerTag(str);
        if (Log.isLoggable(strLoggerTag, i2)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i3 = 0;
            int length = str2.length();
            while (i3 < length) {
                int iQ = q.Q(str2, '\n', i3, false, 4, null);
                if (iQ == -1) {
                    iQ = length;
                }
                while (true) {
                    iMin = Math.min(iQ, i3 + MAX_LOG_LENGTH);
                    String strSubstring = str2.substring(i3, iMin);
                    l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, strLoggerTag, strSubstring);
                    if (iMin >= iQ) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}