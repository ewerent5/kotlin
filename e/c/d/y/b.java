package e.c.d.y;

import ch.qos.logback.classic.spi.CallerData;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.HttpUrl;

/* compiled from: $Gson$Types.java */
/* loaded from: classes.dex */
public final class b {
    static final Type[] a = new Type[0];

    /* compiled from: $Gson$Types.java */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private final Type f15453e;

        public a(Type type) {
            this.f15453e = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f15453e;
        }

        public int hashCode() {
            return this.f15453e.hashCode();
        }

        public String toString() {
            return b.u(this.f15453e) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: e.c.d.y.b$b, reason: collision with other inner class name */
    private static final class C0189b implements ParameterizedType, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private final Type f15454e;

        /* renamed from: f, reason: collision with root package name */
        private final Type f15455f;

        /* renamed from: g, reason: collision with root package name */
        private final Type[] f15456g;

        public C0189b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                e.c.d.y.a.a(z);
            }
            this.f15454e = type == null ? null : b.b(type);
            this.f15455f = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f15456g = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                e.c.d.y.a.b(this.f15456g[i2]);
                b.c(this.f15456g[i2]);
                Type[] typeArr3 = this.f15456g;
                typeArr3[i2] = b.b(typeArr3[i2]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f15456g.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f15454e;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f15455f;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f15456g) ^ this.f15455f.hashCode()) ^ b.m(this.f15454e);
        }

        public String toString() {
            int length = this.f15456g.length;
            if (length == 0) {
                return b.u(this.f15455f);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.u(this.f15455f));
            sb.append("<");
            sb.append(b.u(this.f15456g[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(b.u(this.f15456g[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    private static final class c implements WildcardType, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private final Type f15457e;

        /* renamed from: f, reason: collision with root package name */
        private final Type f15458f;

        public c(Type[] typeArr, Type[] typeArr2) {
            e.c.d.y.a.a(typeArr2.length <= 1);
            e.c.d.y.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                e.c.d.y.a.b(typeArr[0]);
                b.c(typeArr[0]);
                this.f15458f = null;
                this.f15457e = b.b(typeArr[0]);
                return;
            }
            e.c.d.y.a.b(typeArr2[0]);
            b.c(typeArr2[0]);
            e.c.d.y.a.a(typeArr[0] == Object.class);
            this.f15458f = b.b(typeArr2[0]);
            this.f15457e = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f15458f;
            return type != null ? new Type[]{type} : b.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f15457e};
        }

        public int hashCode() {
            Type type = this.f15458f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f15457e.hashCode() + 31);
        }

        public String toString() {
            if (this.f15458f != null) {
                return "? super " + b.u(this.f15458f);
            }
            if (this.f15457e == Object.class) {
                return CallerData.NA;
            }
            return "? extends " + b.u(this.f15457e);
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0189b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        e.c.d.y.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type typeL = l(type, cls, Collection.class);
        if (typeL instanceof WildcardType) {
            typeL = ((WildcardType) typeL).getUpperBounds()[0];
        }
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return i(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeL = l(type, cls, Map.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            e.c.d.y.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        e.c.d.y.a.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    static int m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType o(Type type, Type type2, Type... typeArr) {
        return new C0189b(type, type2, typeArr);
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashSet());
    }

    private static Type q(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeQ = q(type, cls, componentType, collection);
                return componentType == typeQ ? cls2 : a(typeQ);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeQ2 = q(type, cls, genericComponentType, collection);
            return genericComponentType == typeQ2 ? genericArrayType : a(typeQ2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeQ3 = q(type, cls, ownerType, collection);
            boolean z = typeQ3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeQ4 = q(type, cls, actualTypeArguments[i2], collection);
                if (typeQ4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeQ4;
                }
            }
            return z ? o(typeQ3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeQ5 = q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeQ5 != lowerBounds[0]) {
                    return t(typeQ5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeQ6 = q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeQ6 != upperBounds[0]) {
                        return s(typeQ6);
                    }
                }
            }
        }
        return type3;
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD == null) {
            return typeVariable;
        }
        Type typeI = i(type, cls, clsD);
        if (!(typeI instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeI).getActualTypeArguments()[n(clsD.getTypeParameters(), typeVariable)];
    }

    public static WildcardType s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, a);
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}