package com.olegstotsky;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EtcHostsFileType extends LanguageFileType {
    public static final EtcHostsFileType INSTANCE = new EtcHostsFileType();

    private EtcHostsFileType() {
        super(EtcHostsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "/etc/hosts file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "/etc/hosts file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "hosts";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return EtcHostsIcon.FILE;
    }
}
