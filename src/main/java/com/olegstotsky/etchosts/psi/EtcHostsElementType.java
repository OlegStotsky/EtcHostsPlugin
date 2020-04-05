package com.olegstotsky.etchosts.psi;

import com.intellij.psi.tree.IElementType;
import com.olegstotsky.etchosts.EtcHostsLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class EtcHostsElementType extends IElementType {
    public EtcHostsElementType(@NotNull @NonNls String debugName) {
        super(debugName, EtcHostsLanguage.INSTANCE);
    }
}
