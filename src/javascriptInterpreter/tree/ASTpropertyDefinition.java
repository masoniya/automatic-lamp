/* Generated By:JJTree: Do not edit this line. ASTpropertyDefinition.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTpropertyDefinition extends SimpleNode {
  public ASTpropertyDefinition(int id) {
    super(id);
  }

  public ASTpropertyDefinition(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavascriptVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8e346aa1e2caa84c7e5299c86b80595d (do not edit this line) */