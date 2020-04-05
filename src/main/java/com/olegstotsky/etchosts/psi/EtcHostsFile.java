package com.olegstotsky.etchosts.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.psi.FileViewProvider;
import com.olegstotsky.etchosts.EtcHostsFileType;
import com.olegstotsky.etchosts.EtcHostsLanguage;
import org.jetbrains.annotations.NotNull;

public class EtcHostsFile extends PsiFileBase {
    public EtcHostsFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, EtcHostsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public EtcHostsFileType getFileType() {
        return EtcHostsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Etc Hosts File";
    }
}
