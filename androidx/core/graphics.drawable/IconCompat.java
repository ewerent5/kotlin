package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public int f907b;

    /* renamed from: c, reason: collision with root package name */
    Object f908c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f909d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f910e;

    /* renamed from: f, reason: collision with root package name */
    public int f911f;

    /* renamed from: g, reason: collision with root package name */
    public int f912g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f913h;

    /* renamed from: i, reason: collision with root package name */
    PorterDuff.Mode f914i;

    /* renamed from: j, reason: collision with root package name */
    public String f915j;

    public IconCompat() {
        this.f907b = -1;
        this.f909d = null;
        this.f910e = null;
        this.f911f = 0;
        this.f912g = 0;
        this.f913h = null;
        this.f914i = a;
        this.f915j = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f911f = i2;
        if (resources != null) {
            try {
                iconCompat.f908c = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f908c = str;
        }
        return iconCompat;
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    private static Uri j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private InputStream k(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e2);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f908c));
        } catch (FileNotFoundException e3) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e3);
            return null;
        }
    }

    private static String p(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i2 = this.f907b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f908c);
        }
        if (i2 == 2) {
            return this.f911f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int i2 = this.f907b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.f908c);
        }
        if (i2 == 2) {
            return ((String) this.f908c).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i2 = this.f907b;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : h((Icon) this.f908c);
    }

    public Uri i() {
        int i2 = this.f907b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.f908c);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f908c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public void l() {
        this.f914i = PorterDuff.Mode.valueOf(this.f915j);
        switch (this.f907b) {
            case -1:
                Parcelable parcelable = this.f910e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f908c = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f910e;
                if (parcelable2 != null) {
                    this.f908c = parcelable2;
                    return;
                }
                byte[] bArr = this.f909d;
                this.f908c = bArr;
                this.f907b = 3;
                this.f911f = 0;
                this.f912g = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.f908c = new String(this.f909d, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f908c = this.f909d;
                return;
        }
    }

    public void m(boolean z) {
        this.f915j = this.f914i.name();
        switch (this.f907b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f910e = (Parcelable) this.f908c;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.f910e = (Parcelable) this.f908c;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f908c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f909d = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f909d = ((String) this.f908c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f909d = (byte[]) this.f908c;
                return;
            case 4:
            case 6:
                this.f909d = this.f908c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        Icon iconCreateWithBitmap;
        switch (this.f907b) {
            case -1:
                return (Icon) this.f908c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f908c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(e(), this.f911f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f908c, this.f911f, this.f912g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f908c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f908c, false));
                    break;
                } else {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f908c);
                    break;
                }
            case 6:
                if (context == null) {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + i());
                }
                InputStream inputStreamK = k(context);
                if (inputStreamK == null) {
                    throw new IllegalStateException("Cannot load adaptive icon from uri: " + i());
                }
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamK), false));
                    break;
                } else {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamK));
                    break;
                }
        }
        ColorStateList colorStateList = this.f913h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f914i;
        if (mode != a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public String toString() {
        if (this.f907b == -1) {
            return String.valueOf(this.f908c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f907b));
        switch (this.f907b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f908c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f908c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(e());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f911f);
                if (this.f912g != 0) {
                    sb.append(" off=");
                    sb.append(this.f912g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f908c);
                break;
        }
        if (this.f913h != null) {
            sb.append(" tint=");
            sb.append(this.f913h);
        }
        if (this.f914i != a) {
            sb.append(" mode=");
            sb.append(this.f914i);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i2) {
        this.f907b = -1;
        this.f909d = null;
        this.f910e = null;
        this.f911f = 0;
        this.f912g = 0;
        this.f913h = null;
        this.f914i = a;
        this.f915j = null;
        this.f907b = i2;
    }
}