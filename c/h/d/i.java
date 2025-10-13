package c.h.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.c.c;
import c.h.i.b;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public class i extends j {
    @Override // c.h.d.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws IOException {
        c.C0009c[] c0009cArrA = bVar.a();
        int length = c0009cArrA.length;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            c.C0009c c0009c = c0009cArrA[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, c0009c.b()).setWeight(c0009c.e());
                if (!c0009c.f()) {
                    i4 = 0;
                }
                Font fontBuild = weight.setSlant(i4).setTtcIndex(c0009c.c()).setFontVariationSettings(c0009c.d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
    }

    @Override // c.h.d.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                if (builder == null) {
                    return null;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
            }
            b.f fVar = fVarArr[i3];
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fVar.c(), "r", cancellationSignal);
            } catch (IOException unused) {
                continue;
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
                i3++;
            } else {
                try {
                    Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fVar.d());
                    if (!fVar.e()) {
                        i4 = 0;
                    }
                    Font fontBuild = weight.setSlant(i4).setTtcIndex(fVar.b()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
            i3++;
        }
    }

    @Override // c.h.d.j
    protected Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // c.h.d.j
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // c.h.d.j
    protected b.f h(b.f[] fVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}