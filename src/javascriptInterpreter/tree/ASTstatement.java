/* Generated By:JJTree: Do not edit this line. ASTstatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTstatement extends SimpleNode {
  public ASTstatement(int id) {
    super(id);
  }

  public ASTstatement(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8c955e3811b2462eadac337588278a85 (do not edit this line) */