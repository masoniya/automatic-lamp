/* Generated By:JJTree: Do not edit this line. ASTmultiplicativeExpression.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTmultiplicativeExpression extends SimpleNode {
  public ASTmultiplicativeExpression(int id) {
    super(id);
  }

  public ASTmultiplicativeExpression(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1002ad0319f1aa1c0bb8da05f0742924 (do not edit this line) */