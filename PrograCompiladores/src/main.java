//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import generated.ObtenerError;
import generated.ParserProgra;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import generated.ScannerProgra;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import textpademo.TPEditor;

import javax.swing.*;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        ScannerProgra scanner = null;
        ParserProgra parser = null;
        new TPEditor().jFrame.setVisible(true);
        try {
            ANTLRInputStream e = new ANTLRInputStream(new FileReader("prueba.txt"));
            scanner = new ScannerProgra(e);
            CommonTokenStream tokens = new CommonTokenStream(scanner);
            parser = new ParserProgra(tokens);
            List lista = scanner.getAllTokens();
            Iterator var6 = lista.iterator();

            while(var6.hasNext()) {
                Token t = (Token)var6.next();
                System.out.println(t.getType() + " : \'" + t.getText() + "\'");
            }

            parser.setErrorHandler(new ObtenerError());
            //parser.program();
            scanner.reset();
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            ScannerProgra lexer = new ScannerProgra(input);
            CommonTokenStream tokenss = new CommonTokenStream(lexer);
            ParserProgra parserr = new ParserProgra(tokenss);
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parserr));


        } catch (Exception var8) {
            System.out.println("No hay archivo");
        }

    }
}
