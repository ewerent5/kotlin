package com.google.firebase.crashlytics.d.i;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.h;
import java.io.File;
import java.util.Set;

/* compiled from: LogFileManager.java */
/* loaded from: classes.dex */
public class b {
    private static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final Context f12491b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0132b f12492c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.firebase.crashlytics.d.i.a f12493d;

    /* compiled from: LogFileManager.java */
    /* renamed from: com.google.firebase.crashlytics.d.i.b$b, reason: collision with other inner class name */
    public interface InterfaceC0132b {
        File a();
    }

    /* compiled from: LogFileManager.java */
    private static final class c implements com.google.firebase.crashlytics.d.i.a {
        private c() {
        }

        @Override // com.google.firebase.crashlytics.d.i.a
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.d.i.a
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.d.i.a
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.d.i.a
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.d.i.a
        public void e(long j2, String str) {
        }
    }

    public b(Context context, InterfaceC0132b interfaceC0132b) {
        this(context, interfaceC0132b, null);
    }

    private String e(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".temp");
        return iLastIndexOf == -1 ? name : name.substring(20, iLastIndexOf);
    }

    private File f(String str) {
        return new File(this.f12492c.a(), "crashlytics-userlog-" + str + ".temp");
    }

    public void a() {
        this.f12493d.d();
    }

    public void b(Set<String> set) {
        File[] fileArrListFiles = this.f12492c.a().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!set.contains(e(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] c() {
        return this.f12493d.c();
    }

    public String d() {
        return this.f12493d.b();
    }

    public final void g(String str) {
        this.f12493d.a();
        this.f12493d = a;
        if (str == null) {
            return;
        }
        if (h.l(this.f12491b, "com.crashlytics.CollectCustomLogs", true)) {
            h(f(str), 65536);
        } else {
            com.google.firebase.crashlytics.d.b.f().b("Preferences requested no custom logs. Aborting log file creation.");
        }
    }

    void h(File file, int i2) {
        this.f12493d = new d(file, i2);
    }

    public void i(long j2, String str) {
        this.f12493d.e(j2, str);
    }

    public b(Context context, InterfaceC0132b interfaceC0132b, String str) {
        this.f12491b = context;
        this.f12492c = interfaceC0132b;
        this.f12493d = a;
        g(str);
    }
}