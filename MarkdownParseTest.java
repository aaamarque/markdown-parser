
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownTesting() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), links);

        fileName = Path.of("test-file2.md");
        content = Files.readString(fileName);

        links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://youtube.com","same-thing.html"), links);

   }
    
}

