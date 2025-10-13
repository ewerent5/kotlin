package e.d.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Fig.java */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, Object obj, int i2) throws Resources.NotFoundException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            d(context, obj, xml);
        } finally {
            xml.close();
        }
    }

    private static void b(Context context, Object obj, String str, String str2) throws IllegalAccessException, b, IllegalArgumentException, InvocationTargetException {
        try {
            Object objG = g(obj, str);
            if (objG != null) {
                int iLastIndexOf = str.lastIndexOf(".");
                String strSubstring = iLastIndexOf > 0 ? str.substring(iLastIndexOf + 1, str.length()) : str;
                Method methodH = h(objG.getClass(), strSubstring);
                Class<?>[] parameterTypes = methodH.getParameterTypes();
                if (parameterTypes.length < 1) {
                    throw new IllegalArgumentException("Error inflating XML: no setter method found for param \"" + strSubstring + "\".");
                }
                String[] strArrSplit = str2.split("\\|");
                if (strArrSplit.length == parameterTypes.length) {
                    methodH.invoke(objG, i(context, parameterTypes, strArrSplit));
                    return;
                }
                throw new IllegalArgumentException("Error inflating XML: Unexpected number of argments passed to \"" + methodH.getName() + "\".  Expected: " + parameterTypes.length + " Got: " + strArrSplit.length);
            }
        } catch (IllegalAccessException e2) {
            throw new b("Error while parsing key: " + str + " value: " + str2, e2);
        } catch (NoSuchMethodException e3) {
            throw new b("Error while parsing key: " + str + " value: " + str2, e3);
        } catch (InvocationTargetException e4) {
            throw new b("Error while parsing key: " + str + " value: " + str2, e4);
        }
    }

    public static void c(Context context, Object obj, HashMap<String, String> map) throws IllegalAccessException, b, IllegalArgumentException, InvocationTargetException {
        for (String str : map.keySet()) {
            b(context, obj, str, map.get(str));
        }
    }

    private static void d(Context context, Object obj, XmlPullParser xmlPullParser) throws XmlPullParserException, IllegalAccessException, b, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            HashMap map = new HashMap();
            while (true) {
                if (xmlPullParser.getEventType() == 1) {
                    break;
                }
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2) {
                    if (name.equalsIgnoreCase("config")) {
                        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                            map.put(xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                        }
                    }
                }
            }
            c(context, obj, map);
        } catch (IOException e2) {
            throw new b("Error while parsing XML configuration", e2);
        } catch (XmlPullParserException e3) {
            throw new b("Error while parsing XML configuration", e3);
        }
    }

    private static Method e(Class cls, String str) {
        return f(cls, "get" + str);
    }

    private static Method f(Class cls, String str) throws NoSuchMethodException, SecurityException {
        for (Method method : cls.getMethods()) {
            if (method.getName().equalsIgnoreCase(str)) {
                return method;
            }
        }
        throw new NoSuchMethodException("No such public method (case insensitive): " + str + " in " + cls);
    }

    static Object g(Object obj, String str) throws NoSuchMethodException {
        if (obj == null) {
            throw new NullPointerException("Attempt to call getObjectContaining(...) on a null Object instance.  Path was: " + str);
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf <= 0) {
            return obj;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1, str.length());
        Method methodE = e(obj.getClass(), strSubstring);
        if (methodE != null) {
            return g(methodE.invoke(obj, new Object[0]), strSubstring2);
        }
        throw new NoSuchMethodException("No getter found for field: " + strSubstring + " within " + obj.getClass());
    }

    private static Method h(Class cls, String str) {
        return f(cls, "set" + str);
    }

    private static Object[] i(Context context, Class[] clsArr, String[] strArr) {
        Object[] objArr = new Object[clsArr.length];
        int i2 = 0;
        for (Class cls : clsArr) {
            if (Enum.class.isAssignableFrom(cls)) {
                objArr[i2] = cls.getMethod(CoreConstants.VALUE_OF, String.class).invoke(null, strArr[i2].toUpperCase());
            } else if (cls.equals(Float.TYPE) || cls == Float.class) {
                objArr[i2] = Float.valueOf(j(context, strArr[i2]));
            } else if (cls.equals(Integer.TYPE) || cls == Integer.class) {
                objArr[i2] = Integer.valueOf(k(strArr[i2]));
            } else if (cls.equals(Boolean.TYPE) || cls == Boolean.class) {
                objArr[i2] = Boolean.valueOf(strArr[i2]);
            } else {
                if (!cls.equals(String.class)) {
                    throw new IllegalArgumentException("Error inflating XML: Setter requires param of unsupported type: " + cls);
                }
                objArr[i2] = m(context, strArr[i2]);
            }
            i2++;
        }
        return objArr;
    }

    private static float j(Context context, String str) {
        try {
            try {
                return context.getResources().getDimension(l(context, str));
            } catch (Exception unused) {
                return Float.parseFloat(str);
            }
        } catch (IllegalArgumentException unused2) {
            return c.b(context, str);
        }
    }

    private static int k(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.parseInt(str);
        }
        if (str.startsWith("@")) {
            return Color.parseColor(str);
        }
        if (str.equalsIgnoreCase("#0")) {
            return 0;
        }
        return Color.parseColor(str);
    }

    private static int l(Context context, String str) {
        if (!str.startsWith("@")) {
            throw new IllegalArgumentException();
        }
        if (!str.contains("/")) {
            return Integer.parseInt(str.substring(1));
        }
        String[] strArrSplit = str.split("/");
        String strReplace = strArrSplit[0].replace("@", "");
        return context.getResources().getIdentifier(strArrSplit[1], strReplace, context.getPackageName());
    }

    private static String m(Context context, String str) {
        try {
            return context.getResources().getString(l(context, str));
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }
}