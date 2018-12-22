/* Generated By:JavaCC: Do not edit this line. JavascriptDefaultVisitor.java Version 7.0.5 */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public class JavascriptDefaultVisitor implements JavascriptVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTprimaryExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTliteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTarrayLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTspreadElement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTobjectLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTpropertyDefinition node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTparenthesizedExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTleftSideExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcallExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTarguments node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTnewExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTmemberExpression node, Object data){
    return defaultVisit(node, data);
}
  public Object visit(ASTupdateExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTunaryExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTexponentiationOperator node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTmultiplicativeExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTadditiveExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTshiftExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTrelationalExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTequalityExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTbitwiseAndExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTbitwiseXorExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTbitwiseOrExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTlogicalAndExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTlogicalOrExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTconditionalExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTassignmentExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTexpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTfunctionExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTstatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTemptyStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTexpressionStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTvariableDefinition node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTvariableDeclarationList node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTvariableDeclaration node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTblock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTlabeledStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTifStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTswitchStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcaseBlock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcaseClauses node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcaseClause node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTdefaultClause node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTdoStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTwhileStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTforStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTforHeader node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTforInitializer node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTforInHeader node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTforInBinding node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcontinueStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTbreakStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTreturnStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTthrowStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTtryStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcatchClauses node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTcatchClause node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTfinallyClause node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTnamedFunction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTanonymousFunction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTformalParameters node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTfunctionBody node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTtopStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTtopStatements node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTprogram node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=f063d88a6b991ece9f165640d5eafafc (do not edit this line) */
