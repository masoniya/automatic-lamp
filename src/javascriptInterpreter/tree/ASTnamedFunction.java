/* Generated By:JJTree: Do not edit this line. ASTnamedFunction.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javascriptInterpreter.tree;

import javascriptInterpreter.parser.*;

public
class ASTnamedFunction extends SimpleNode {
  public ASTnamedFunction(int id) {
    super(id);
  }

  public ASTnamedFunction(Javascript p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public javascriptInterpreter.visitors.JavascriptType jjtAccept(JavascriptVisitor visitor, javascriptInterpreter.visitors.Context data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=49054fe4b4c636f5c1ea2fee3dc27b8c (do not edit this line) */
