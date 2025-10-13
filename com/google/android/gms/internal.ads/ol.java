package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ol extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<ol> CREATOR = new pl();

    /* renamed from: e, reason: collision with root package name */
    ParcelFileDescriptor f7966e;

    /* renamed from: f, reason: collision with root package name */
    private Parcelable f7967f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7968g = true;

    public ol(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7966e = parcelFileDescriptor;
    }

    public final <T extends com.google.android.gms.common.internal.w.d> T c(Parcelable.Creator<T> creator) throws IOException {
        if (this.f7968g) {
            ParcelFileDescriptor parcelFileDescriptor = this.f7966e;
            if (parcelFileDescriptor == null) {
                er.zzf("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    int i2 = dataInputStream.readInt();
                    byte[] bArr = new byte[i2];
                    dataInputStream.readFully(bArr, 0, i2);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i2);
                        parcelObtain.setDataPosition(0);
                        this.f7967f = creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f7968g = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e2) {
                    er.zzg("Could not read from parcel file descriptor", e2);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                com.google.android.gms.common.util.l.a(dataInputStream);
                throw th2;
            }
        }
        return (T) this.f7967f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f7966e == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f7967f.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        qr.a.execute(new Runnable(autoCloseOutputStream, bArrMarshall) { // from class: com.google.android.gms.internal.ads.ml

                            /* renamed from: e, reason: collision with root package name */
                            private final OutputStream f7502e;

                            /* renamed from: f, reason: collision with root package name */
                            private final byte[] f7503f;

                            {
                                this.f7502e = autoCloseOutputStream;
                                this.f7503f = bArrMarshall;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                OutputStream outputStream = this.f7502e;
                                byte[] bArr = this.f7503f;
                                Parcelable.Creator<ol> creator = ol.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            com.google.android.gms.common.util.l.a(dataOutputStream2);
                                        } catch (IOException e2) {
                                            e = e2;
                                            dataOutputStream = dataOutputStream2;
                                            er.zzg("Error transporting the ad response", e);
                                            zzs.zzg().g(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                com.google.android.gms.common.util.l.a(outputStream);
                                            } else {
                                                com.google.android.gms.common.util.l.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                com.google.android.gms.common.util.l.a(outputStream);
                                            } else {
                                                com.google.android.gms.common.util.l.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e2) {
                        e = e2;
                        er.zzg("Error transporting the ad response", e);
                        zzs.zzg().g(e, "LargeParcelTeleporter.pipeData.2");
                        com.google.android.gms.common.util.l.a(autoCloseOutputStream);
                        this.f7966e = parcelFileDescriptor;
                        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
                        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f7966e, i2, false);
                        com.google.android.gms.common.internal.w.c.b(parcel, iA);
                    }
                } catch (IOException e3) {
                    e = e3;
                    autoCloseOutputStream = null;
                }
                this.f7966e = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iA2 = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f7966e, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA2);
    }
}