
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    
    //@Test
    //public void addition() {
      //  assertEquals(2, 1 + 1);
    //}
    /*
    @Test
    public void MarkdownTesting() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), links);


   }
   
   @Test
   public void MarkdownTesting2() throws IOException {
       Path fileName = Path.of("test-file2.md");
       String content = Files.readString(fileName);
        
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("an-image.jpeg","a-link.html"), links);


   }
   */
   @Test 
   public void MarkdownParseTesting_Snippet1() throws IOException {
    Path fileName = Path.of("test-file.md");
    String content = Files.readString(fileName);
    
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("`google.com"), links);

   }

   @Test 
   public void MarkdownParseTesting_Snippet2() throws IOException {
    Path fileName = Path.of("test-file2.md");
    String content = Files.readString(fileName);
    
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("a.com","a.com(())", "example.com"), links);

   }

   @Test 
   public void MarkdownParseTesting_Snippet3() throws IOException {
    Path fileName = Path.of("test-file3.md");
    String content = Files.readString(fileName);
    
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(List.of("https://www.twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
                   "https://cse.ucsd.edu/"), links);

   }

    
}

