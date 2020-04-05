package com.olegstotsky.etchosts;

import com.intellij.lexer.FlexAdapter;
import com.olegstotsky.etchosts.grammar.EtcHostsLexer;

public class EtcHostsLexerAdapter extends FlexAdapter {
    public EtcHostsLexerAdapter() {
        super(new EtcHostsLexer(null));
    }
}
