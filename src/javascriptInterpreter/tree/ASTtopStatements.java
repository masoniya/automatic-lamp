/* Generated By:JJTree: Do not edit this line. ASTtopStatements.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTtopStatements extends SimpleNode {
  public ASTtopStatements(int id) {
    super(id);
  }

  public ASTtopStatements(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9ba2e6bdb1ec8a5f21562da374653db1 (do not edit this line) */
