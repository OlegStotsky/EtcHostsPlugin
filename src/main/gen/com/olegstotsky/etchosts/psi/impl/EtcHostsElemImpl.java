// This is a generated file. Not intended for manual editing.
package com.olegstotsky.etchosts.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.olegstotsky.etchosts.psi.EtcHostsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.olegstotsky.etchosts.psi.*;

public class EtcHostsElemImpl extends ASTWrapperPsiElement implements EtcHostsElem {

  public EtcHostsElemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EtcHostsVisitor visitor) {
    visitor.visitElem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EtcHostsVisitor) accept((EtcHostsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIp() {
    return findNotNullChildByType(IP);
  }

}
