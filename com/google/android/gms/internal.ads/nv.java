package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class nv implements f02 {
    private final String a;

    nv(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.f02
    public final URLConnection zza() throws IOException {
        String str = this.a;
        int i2 = ov.f8022j;
        zzs.zzo();
        int iIntValue = ((Integer) c.c().b(w3.v)).intValue();
        URL url = new URL(str);
        int i3 = 0;
        while (true) {
            i3++;
            if (i3 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            dr drVar = new dr(null);
            drVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            drVar.c(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
            }
            er.zzd(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
            httpURLConnection.disconnect();
            url = url2;
        }
    }
}