package com.olegstotsky;

import com.intellij.lang.Language;

public class EtcHostsLanguage extends Language {
    public static final EtcHostsLanguage INSTANCE = new EtcHostsLanguage();

    private EtcHostsLanguage() {
        super("EtcHosts");
    }
}
