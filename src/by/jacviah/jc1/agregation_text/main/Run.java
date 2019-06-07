package by.jacviah.jc1.agregation_text.main;

import by.jacviah.jc1.agregation_text.entity.Sentence;
import by.jacviah.jc1.agregation_text.entity.Text;
import by.jacviah.jc1.agregation_text.entity.Word;

public class Run {
    public static void main(String[] args) {
        //sentence 1
        Word word1 = new Word("Даны");
        Word word2 = new Word("X");
        Word word3 = new Word("и");
        Word word4 = new Word("Y");
        Sentence sentence1 = new Sentence(word1, word2, word3, word4);
        //sentence 2
        Word word5 = new Word("Вычислить");
        Word word6 = new Word("их");
        Word word7 = new Word("сумму,");
        Word word8 = new Word("разность");
        Word word9 = new Word("и");
        Word word10 = new Word("произведение");
        Sentence sentence2 = new Sentence(word5, word6, word7, word8, word9, word10);
        //text
        Text text = new Text("Задача", sentence1, sentence2);
        text.showText();
        //change sign
        sentence1.setSign("!");
        Text text2 = new Text("Задача", sentence1, sentence2);
        text2.showText();
        //insert sentence in the middle of the text
        Sentence sentence3 = new Sentence(new Word("Вставка"), new Word("предложения"));
        text2.addSentence(1, sentence3);
        text2.showText();
    }
}
