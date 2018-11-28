import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pcl2 
{
    public static void main(String[] args) throws Exception 
    {
        String inputFile = null;
        
        if (args.length > 0) inputFile = args[0];
        InputStream is = (inputFile != null)
                                ? new FileInputStream(inputFile)
                                : System.in;
        
        CharStream cs = CharStreams.fromStream(is);
        FantasticLexer lexer = new FantasticLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FantasticParser parser = new FantasticParser(tokens);
        ParseTree tree = parser.prog();

        if (inputFile == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the input file name: ");
            inputFile = scanner.next();
        }

        Pass1Visitor pass1 = new Pass1Visitor(inputFile.split("[.]")[0]);
        pass1.visit(tree);

        PrintWriter jFile = pass1.getAssemblyFile();
        jFile.close();

        Pass2Visitor pass2 = new Pass2Visitor(jFile);
        pass2.visit(tree);
    }
}
