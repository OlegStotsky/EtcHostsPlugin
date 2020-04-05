package com.olegstotsky.etchosts.psi;

import com.intellij.psi.tree.IElementType;
import com.olegstotsky.etchosts.EtcHostsLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class EtcHostsTokenType extends IElementType {
    public EtcHostsTokenType(@NotNull @NonNls String debugName) {
        super(debugName, EtcHostsLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "EtcHostsTokenType." + super.toString();
    }
}
