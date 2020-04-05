// This is a generated file. Not intended for manual editing.
package com.olegstotsky.etchosts.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.olegstotsky.etchosts.psi.impl.*;

public interface EtcHostsTypes {

  IElementType ELEM = new EtcHostsElementType("ELEM");
  IElementType ITEM = new EtcHostsElementType("ITEM");

  IElementType COMMENT = new EtcHostsTokenType("comment");
  IElementType ID = new EtcHostsTokenType("id");
  IElementType IP = new EtcHostsTokenType("ip");
  IElementType NUMBER = new EtcHostsTokenType("number");
  IElementType SHARP = new EtcHostsTokenType("#");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ELEM) {
        return new EtcHostsElemImpl(node);
      }
      else if (type == ITEM) {
        return new EtcHostsItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
