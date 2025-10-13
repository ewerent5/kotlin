package com.parizene.netmonitor;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;

/* compiled from: AppFilesProvider.kt */
/* loaded from: classes.dex */
public final class k {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f13200b;

    /* compiled from: AppFilesProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public k(Context context) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f13200b = context;
    }

    public final boolean a() {
        File fileB = b();
        if (fileB.exists()) {
            return true;
        }
        return fileB.mkdirs() && fileB.exists();
    }

    public final File b() {
        return new File(Environment.getExternalStorageDirectory(), "data/netmonitor");
    }

    public final File c() {
        return new File(this.f13200b.getExternalFilesDir(null), "osmdroid");
    }

    public final Uri d(File file) {
        i.y.d.l.d(file, Action.FILE_ATTRIBUTE);
        Uri uriE = FileProvider.e(this.f13200b, "com.parizene.netmonitor.fileprovider", file);
        i.y.d.l.c(uriE, "getUriForFile(context, authority, file)");
        return uriE;
    }

    public final File e() {
        return new File(this.f13200b.getExternalFilesDir(null), "log_" + ((Object) Build.DEVICE) + ".html");
    }
}