// WordDocumentFactory.java - Concrete Creator
public class WordDocumentFactory extends DocumentFactory {
    
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
