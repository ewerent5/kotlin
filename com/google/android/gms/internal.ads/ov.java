package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ov extends lv {

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f8020h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i, reason: collision with root package name */
    private static final DecimalFormat f8021i = new DecimalFormat("#,###");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8022j = 0;

    /* renamed from: k, reason: collision with root package name */
    private File f8023k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8024l;

    public ov(lt ltVar) {
        super(ltVar);
        File cacheDir = this.f7326e.getCacheDir();
        if (cacheDir == null) {
            er.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f8023k = file;
        if (!file.isDirectory() && !this.f8023k.mkdirs()) {
            String strValueOf = String.valueOf(this.f8023k.getAbsolutePath());
            er.zzi(strValueOf.length() != 0 ? "Could not create preload cache directory at ".concat(strValueOf) : new String("Could not create preload cache directory at "));
            this.f8023k = null;
        } else {
            if (this.f8023k.setReadable(true, false) && this.f8023k.setExecutable(true, false)) {
                return;
            }
            String strValueOf2 = String.valueOf(this.f8023k.getAbsolutePath());
            er.zzi(strValueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(strValueOf2) : new String("Could not set cache file permissions at "));
            this.f8023k = null;
        }
    }

    private final File v(File file) {
        return new File(this.f8023k, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ab, code lost:
    
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ad, code lost:
    
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02bb, code lost:
    
        if (r1.length() == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02bd, code lost:
    
        r11 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c8, code lost:
    
        r11 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d0, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d4, code lost:
    
        r2 = r11;
        r1 = r14;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02dc, code lost:
    
        r11 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x036e, code lost:
    
        r26 = r4;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0374, code lost:
    
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0376, code lost:
    
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r11 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a1, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03a5, code lost:
    
        r2 = r11;
        r1 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03bd, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03c3, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03cb, code lost:
    
        if (com.google.android.gms.internal.ads.er.zzm(3) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03cd, code lost:
    
        r1 = com.google.android.gms.internal.ads.ov.f8021i.format(r13);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r30).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r30);
        com.google.android.gms.internal.ads.er.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0403, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x040c, code lost:
    
        if (r0.isFile() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x040e, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0416, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c9  */
    @Override // com.google.android.gms.internal.ads.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(final java.lang.String r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ov.h(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void o() {
        this.f8024l = true;
    }
}