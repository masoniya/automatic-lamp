/* Generated By:JJTree: Do not edit this line. ASTlogicalOrExpression.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTlogicalOrExpression extends SimpleNode {
  public ASTlogicalOrExpression(int id) {
    super(id);
  }

  public ASTlogicalOrExpression(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=85fe648972d5041c26b86139c38d1150 (do not edit this line) */