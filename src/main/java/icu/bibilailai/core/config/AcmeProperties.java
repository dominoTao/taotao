package icu.bibilailai.core.config;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties("acme")
@Component
@ConfigurationProperties(prefix="acme")
public class AcmeProperties {

    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {  }

    public InetAddress getRemoteAddress() {
//        return InetAddress.holder();
        return null;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {  }

    public Security getSecurity() {
        return null;
    }

    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

        public String getUsername() {
            return "";
        }

        public void setUsername(String username) {  }

        public String getPassword() {
            return "";
        }

        public void setPassword(String password) {  }

        public List<String> getRoles() {
            return null;
        }

        public void setRoles(List<String> roles) {  }

    }
}