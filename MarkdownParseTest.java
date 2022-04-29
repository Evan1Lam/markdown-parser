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
}    