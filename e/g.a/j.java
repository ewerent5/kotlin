package e.g.a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: Security.java */
/* loaded from: classes.dex */
public class j {
    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    public static boolean b(PublicKey publicKey, String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (signature.verify(bArrDecode)) {
                    return true;
                }
                Log.e("IABUtil/Security", "Signature verification failed.");
                return false;
            } catch (InvalidKeyException unused) {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return false;
            } catch (NoSuchAlgorithmException unused2) {
                Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
                return false;
            } catch (SignatureException unused3) {
                Log.e("IABUtil/Security", "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused4) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }

    public static boolean c(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return b(a(str), str2, str3);
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }
}