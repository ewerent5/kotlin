package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigStorageClient.java */
/* loaded from: classes.dex */
public class o {
    private static final Map<String, o> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f12968b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12969c;

    private o(Context context, String str) {
        this.f12968b = context;
        this.f12969c = str;
    }

    public static synchronized o c(Context context, String str) {
        Map<String, o> map;
        map = a;
        if (!map.containsKey(str)) {
            map.put(str, new o(context, str));
        }
        return map.get(str);
    }

    public synchronized Void a() {
        this.f12968b.deleteFile(this.f12969c);
        return null;
    }

    String b() {
        return this.f12969c;
    }

    @Nullable
    public synchronized f d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            fileInputStreamOpenFileInput = this.f12968b.openFileInput(this.f12969c);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            fileInputStreamOpenFileInput = null;
            th = th2;
        }
        try {
            int iAvailable = fileInputStreamOpenFileInput.available();
            byte[] bArr = new byte[iAvailable];
            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
            f fVarB = f.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStreamOpenFileInput.close();
            return fVarB;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            throw th;
        }
    }

    public synchronized Void e(f fVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f12968b.openFileOutput(this.f12969c, 0);
        try {
            fileOutputStreamOpenFileOutput.write(fVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }
}