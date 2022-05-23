//imports reuqired files for junit
import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

//define tester class
public class MarkdownParseTest {
    //specifies this is a test
    @Test

    //test name
    public void addition() {
        //checks if two arguments are equal
         assertEquals(2, 1 + 1);
    }



    @Test

    //test name
    public void getLinks() throws IOException {
        //checks if two arguments are equal
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("https://something.com", links.get(0));
         assertEquals("some-page.html", links.get(1));

    }


    @Test

    //test name
    public void getLinks2() throws IOException {
        //checks if two arguments are equal
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("newTest-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("https://something.com", links.get(0));


    }

    @Test 

    //test name
    public void getLinks3() throws IOException { ///////////// fixing this test
        //checks if two arguments are equal
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("newTest2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("https://something.com", links.get(0));
         assertEquals(1, links.size());
         System.out.println();


    }


    @Test 

    //test name
    public void getLinks4() throws IOException {
        //checks if two arguments are equal
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("newTest3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("https://something.com", links.get(0));
         assertEquals(1, links.size());


    }

    @Test 

    //snippet 1 test
    public void getLinks5() throws IOException {
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("`google.com", links.get(1));
         assertEquals(1, links.size());

         


    }

    @Test 

    //snippet 2 test
    public void getLinks6() throws IOException {
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("a.com(())", links.get(1));
         assertEquals(1, links.size());


    }

    @Test 

    //snippet 3 test
    public void getLinks7() throws IOException {
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = parse.getLinks(content);
         assertEquals("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", links.get(1));
         assertEquals(1, links.size());


    }
}    