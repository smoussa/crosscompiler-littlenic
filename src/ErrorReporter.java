
/**
 * ErrorReporter is the interface which defines the methods that should be used 
 * to report compilation errors. All errors MUST be reported using this interface,
 * as the automatic marking script depends on it. This file MUST not be altered.
 *
 */
public interface ErrorReporter {
	
	/**
	 * Returns how many errors have been reported using the various report methods below.
	 * @return
	 */
	public int numErrorsReported();

	/**
	 * SYNTAX ERRORs
	 * This method should be used to report ALL errors produced by the Parser and
	 * Lexer. 
	 * @param lineNum             the line number on which the error occurred (the first line is line 1)
	 * @param charPositionInLine  the character offset into that line where the error occurred (first char is 1)
	 * @param message             a descriptive message describing the error
	 */
	public void reportSyntaxError(int lineNum, int charPositionInLine, String message);
	
	/**
	 * UNDECLARED ERRORs
	 * This method should be used to report all contextual errors where a procedure,
	 * function or variable is not declared before it is used.
	 * @param lineNum            the line number on which the undeclared id was used
	 * @param charPositionInLine the character offset into that line where the undeclared id starts
	 * @param id                 the id of the undeclared variable, procedure or function.
	 */
	public void reportUndeclaredError(int lineNum, int charPositionInLine, String id);
	
	/**
	 * NAME ERRORs
	 * This method should be used to report all contextual errors where the same
	 * name is used for two conflicting declarations. e.g. a procedure and a function
	 * with the same name, or two function parameters in the same function with the same name.
	 * @param lineNum            the line number on which the second declaration with the same name is declared
	 * @param charPositionInLine the character offset into that line where the name begins
	 * @param id                 the name which is conflicting
	 */
	public void reportNameError(int lineNum, int charPositionInLine, String id);
	
	/**
	 * TYPE ERRORs
	 * This method should be used to report all type errors. e.g. 
	 * Where the type of a variable and the type of the expression being assigned 
	 * to it don't match, or the type of a function parameter and the type of 
	 * the argument expression passed to it don't match.
	 * @param lineNum   the line number on which the type error occurs. 
	 * @param idOrExpr1 if the error is an assignment where the type of the variable
	 *                  being assigned to doesn't match that of expression on the righ hand side,
	 *                  or if the error is a function/procedure call where the type of the
	 *                  formal parameter doesn't match that of the expression passed to it, then
	 *                  this should be the id of the target variable or the formal parameter respectively.
	 *                  Otherwise this can be any string that suitably represents one of the offending
	 *                  expressions.
	 * @param typeOfIdOrExpr1 the type of the id/expression 1
	 * @param expr2      in the case of an assignment or function/procedure call where the type
	 *                  of the variable/formal parameter doesn't match that of the expression 
	 *                  passed to it, this should be some representation of the expression
	 *                  being assigned to the variable/passed to the function. Otherwise
	 *                  this can be any string that represents the other offending expression.
	 * @param typeOfExpr2 the type of the other expression.
	 */
	public void reportTypeError(int lineNum, 
			String idOrExpr1, String typeOfIdOrExpr1, 
			String expr2,     String typeOfExpr2);
	
}
