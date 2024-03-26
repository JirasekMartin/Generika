// Generika: Napište program, který demonstruje použití
// generických a typových parametrů


// Třída, která přijímá generický typ E
class Box<E> {
    private E content;

    // Konstruktor pro inicializaci obsahu
    public Box(E content) {
        this.content = content;
    }

    // Metoda pro získání obsahu
    public E getContent() {
        return content;
    }

    // Metoda pro nastavení obsahu
    public void setContent(E content) {
        this.content = content;
    }
}

public class Main {
    public static void main(String[] args) {
        // Vytvoření instance Box s typovým parametrem String
        Box<String> stringBox = new Box<>("Hello, world!");

        // Získání obsahu a výpis
        String content = stringBox.getContent();
        System.out.println("Obsah boxu: " + content);

        // Nastavení nového obsahu
        stringBox.setContent("Hello, Java Generics!");

        // Získání a výpis nového obsahu
        String newContent = stringBox.getContent();
        System.out.println("Nový obsah boxu: " + newContent);

        // Vytvoření instance Box s typovým parametrem Integer
        Box<Integer> intBox = new Box<>(42);

        // Získání obsahu a výpis
        int intValue = intBox.getContent();
        System.out.println("Hodnota boxu: " + intValue);

        // Nastavení nové hodnoty
        intBox.setContent(100);

        // Získání a výpis nové hodnoty
        int newIntValue = intBox.getContent();
        System.out.println("Nová hodnota boxu: " + newIntValue);
    }
}

// V tomto programu je definována třída Box, která má generický
// typový parametr E. Tento parametr určuje typ obsahu, který bude
// box uchovávat. Třída Box má metody pro získání a nastavení obsahu.
// V main metodě jsou vytvořeny instance třídy Box s různými typovými
// parametry (String a Integer). Program demonstruje použití generických
// typů pro obecné užití a flexibilitu při práci s různými typy dat.