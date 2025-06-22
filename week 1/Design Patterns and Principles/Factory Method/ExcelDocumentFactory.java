// ExcelDocumentFactory.java - Concrete Creator
public class ExcelDocumentFactory extends DocumentFactory {
    
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
