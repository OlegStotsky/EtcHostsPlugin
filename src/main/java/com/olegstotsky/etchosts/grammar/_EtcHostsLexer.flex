package com.olegstotsky.etchosts.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.olegstotsky.etchosts.psi.EtcHostsTypes.*;

%%

%{
  public EtcHostsLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class EtcHostsLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
NUMBER=[0-9]+
IP=(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])
ID=([a-zA-Z0-9][a-zA-Z0-9.\-]*)?[a-zA-Z0-9]
COMMENT=#[^\r\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "#"                { return SHARP; }

  {SPACE}            { return SPACE; }
  {NUMBER}           { return NUMBER; }
  {IP}               { return IP; }
  {ID}               { return ID; }
  {COMMENT}          { return COMMENT; }

}

[^] { return BAD_CHARACTER; }
