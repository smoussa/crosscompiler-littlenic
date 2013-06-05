import java.io.PrintStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * THIS CLASS SHOULD BE FILLED OUT TO IMPLEMENT YOUR CROSS-COMPILER.
 * TO RUN YOUR COMPILER USE THE Run class e.g. java Run <in file> <out file>...
 */
public class LittleNic {

	/**
	 * THERE MUST ALWAYS BE A CONSTRUCTOR THAT TAKES NO
	 * ARGUMENTS DEFINED FOR THIS CLASS.
	 */
	public LittleNic() {
	}

	/**
	 * THIS METHOD SHOULD BE FILLED OUT TO CALL YOUR PARSER AND
	 * IMPLEMENT YOUR CROSS-COMPILER. THE SOURCE MUST BE READ 
	 * FROM THE CHARSTREAM, ANY JAVA GENERATED MUST BE PASSED TO THE
	 * DEST PRINTSTREAM WITH THE CLASS NAME GIVEN,
	 * AND ALL ERRORS MUST BE PASSED TO THE ERROR REPORTER.
	 * @param source        stream to read LittleNic source from
	 * @param dest          stream to write any generated java to
	 * @param destClassName class name to give the generated java class
	 * @param errReporter   object to report any errors to
	 */
	public void compile(
			CharStream source, 
			PrintStream dest,
			String destClassName,
			ErrorReporter errReporter)
	{

		CommonTree tree;
		CommonTokenStream tokens;
		
		try {

			// call lexer and parser...
			LittleNicLexer l = new LittleNicLexer(source);
			l.err = errReporter;
			tokens = new CommonTokenStream(l);
			LittleNicParser g = new LittleNicParser(tokens);
			g.err = errReporter;
			LittleNicParser.prog_return r = g.prog();

			// walk resulting tree
			tree = (CommonTree) r.getTree();

			// if 1 or more syntax errors then abort
			if (errReporter.numErrorsReported() > 0) {
				return;
			}

		} catch (RecognitionException ex) {
			// IMPORTANT: ALL parser/lexer errors must be reported as below!
			errReporter.reportSyntaxError(ex.line, ex.charPositionInLine, ex.toString());
			return;
		}

		// Contextual constraint checking
		try {
			
			// first walk to declare globals and methods
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);
			LittleNicGlobalWalker globalWalker = new LittleNicGlobalWalker(nodes);
			globalWalker.err = errReporter;
			globalWalker.prog();
			
			// next walk to check methods
			nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);
			LittleNicMethodWalker methodWalker = new LittleNicMethodWalker(nodes);
			methodWalker.err = errReporter;
			methodWalker.globals = globalWalker.globals;
			methodWalker.methods = globalWalker.methods;
			methodWalker.prog();
			
			// next walk to check program body
			nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);
			LittleNicBodyWalker bodyWalker = new LittleNicBodyWalker(nodes);
			bodyWalker.err = errReporter;
			bodyWalker.globals = globalWalker.globals;
			bodyWalker.methods = globalWalker.methods;
			bodyWalker.prog();
			
			nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);
			LittleNicCodeGen genWalker = new LittleNicCodeGen(nodes);
	        String output = null;
	        genWalker.globals = globalWalker.globals;
			try {
				output = genWalker.prog(destClassName);
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
	        dest.print(output);
			
		} catch (RuntimeException e) {
			//e.printStackTrace();
		} catch (RecognitionException e) {
			//e.printStackTrace();
		}

	}

}
