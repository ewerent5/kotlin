package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public class SSLContextFactoryBean {
    private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
    private KeyManagerFactoryFactoryBean keyManagerFactory;
    private KeyStoreFactoryBean keyStore;
    private String protocol;
    private String provider;
    private SecureRandomFactoryBean secureRandom;
    private TrustManagerFactoryFactoryBean trustManagerFactory;
    private KeyStoreFactoryBean trustStore;

    private KeyManager[] createKeyManagers(ContextAware contextAware) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException {
        if (getKeyStore() == null) {
            return null;
        }
        KeyStore keyStoreCreateKeyStore = getKeyStore().createKeyStore();
        contextAware.addInfo("key store of type '" + keyStoreCreateKeyStore.getType() + "' provider '" + keyStoreCreateKeyStore.getProvider() + "': " + getKeyStore().getLocation());
        KeyManagerFactory keyManagerFactoryCreateKeyManagerFactory = getKeyManagerFactory().createKeyManagerFactory();
        contextAware.addInfo("key manager algorithm '" + keyManagerFactoryCreateKeyManagerFactory.getAlgorithm() + "' provider '" + keyManagerFactoryCreateKeyManagerFactory.getProvider() + "'");
        keyManagerFactoryCreateKeyManagerFactory.init(keyStoreCreateKeyStore, getKeyStore().getPassword().toCharArray());
        return keyManagerFactoryCreateKeyManagerFactory.getKeyManagers();
    }

    private SecureRandom createSecureRandom(ContextAware contextAware) throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom secureRandomCreateSecureRandom = getSecureRandom().createSecureRandom();
        contextAware.addInfo("secure random algorithm '" + secureRandomCreateSecureRandom.getAlgorithm() + "' provider '" + secureRandomCreateSecureRandom.getProvider() + "'");
        return secureRandomCreateSecureRandom;
    }

    private TrustManager[] createTrustManagers(ContextAware contextAware) throws IOException, KeyStoreException {
        if (getTrustStore() == null) {
            return null;
        }
        KeyStore keyStoreCreateKeyStore = getTrustStore().createKeyStore();
        contextAware.addInfo("trust store of type '" + keyStoreCreateKeyStore.getType() + "' provider '" + keyStoreCreateKeyStore.getProvider() + "': " + getTrustStore().getLocation());
        TrustManagerFactory trustManagerFactoryCreateTrustManagerFactory = getTrustManagerFactory().createTrustManagerFactory();
        contextAware.addInfo("trust manager algorithm '" + trustManagerFactoryCreateTrustManagerFactory.getAlgorithm() + "' provider '" + trustManagerFactoryCreateTrustManagerFactory.getProvider() + "'");
        trustManagerFactoryCreateTrustManagerFactory.init(keyStoreCreateKeyStore);
        return trustManagerFactoryCreateTrustManagerFactory.getTrustManagers();
    }

    private KeyStoreFactoryBean keyStoreFromSystemProperties(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
        keyStoreFactoryBean.setLocation(locationFromSystemProperty(str));
        keyStoreFactoryBean.setProvider(System.getProperty(str + "Provider"));
        keyStoreFactoryBean.setPassword(System.getProperty(str + "Password"));
        keyStoreFactoryBean.setType(System.getProperty(str + "Type"));
        return keyStoreFactoryBean;
    }

    private String locationFromSystemProperty(String str) {
        String property = System.getProperty(str);
        if (property == null || property.startsWith("file:")) {
            return property;
        }
        return "file:" + property;
    }

    public SSLContext createContext(ContextAware contextAware) throws KeyManagementException {
        SSLContext sSLContext = getProvider() != null ? SSLContext.getInstance(getProtocol(), getProvider()) : SSLContext.getInstance(getProtocol());
        contextAware.addInfo("SSL protocol '" + sSLContext.getProtocol() + "' provider '" + sSLContext.getProvider() + "'");
        sSLContext.init(createKeyManagers(contextAware), createTrustManagers(contextAware), createSecureRandom(contextAware));
        return sSLContext;
    }

    public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
        KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean = this.keyManagerFactory;
        return keyManagerFactoryFactoryBean == null ? new KeyManagerFactoryFactoryBean() : keyManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getKeyStore() {
        if (this.keyStore == null) {
            this.keyStore = keyStoreFromSystemProperties(JSSE_KEY_STORE_PROPERTY);
        }
        return this.keyStore;
    }

    public String getProtocol() {
        String str = this.protocol;
        return str == null ? SSL.DEFAULT_PROTOCOL : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public SecureRandomFactoryBean getSecureRandom() {
        SecureRandomFactoryBean secureRandomFactoryBean = this.secureRandom;
        return secureRandomFactoryBean == null ? new SecureRandomFactoryBean() : secureRandomFactoryBean;
    }

    public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
        TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean = this.trustManagerFactory;
        return trustManagerFactoryFactoryBean == null ? new TrustManagerFactoryFactoryBean() : trustManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getTrustStore() {
        if (this.trustStore == null) {
            this.trustStore = keyStoreFromSystemProperties(JSSE_TRUST_STORE_PROPERTY);
        }
        return this.trustStore;
    }

    public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean) {
        this.keyManagerFactory = keyManagerFactoryFactoryBean;
    }

    public void setKeyStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.keyStore = keyStoreFactoryBean;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSecureRandom(SecureRandomFactoryBean secureRandomFactoryBean) {
        this.secureRandom = secureRandomFactoryBean;
    }

    public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean) {
        this.trustManagerFactory = trustManagerFactoryFactoryBean;
    }

    public void setTrustStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.trustStore = keyStoreFactoryBean;
    }
}