package Structural.Adapter4;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void send(String word) {
        System.out.println("Reading words...");
        System.out.println(word);
        String vietnameseWord = this.translate(word);
        adaptee.receive(vietnameseWord);
    }

    private String translate(String vietnameseWords){
        System.out.println("Translated!!!");
        return "こんにちは";
    }
}
