/* Generated By:JJTree: Do not edit this line. ASTfinallyClause.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTfinallyClause extends SimpleNode {
  public ASTfinallyClause(int id) {
    super(id);
  }

  public ASTfinallyClause(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3b50dcfd9178582da37fa12a847f196f (do not edit this line) */
