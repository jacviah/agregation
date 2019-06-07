package by.jacviah.jc1.agregation_text.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private String paragraph;
    private List<Sentence> sentences = new ArrayList<>();

    public Text(String paragraph, Sentence... sentences) {
        this.paragraph = paragraph;
        for (Sentence i : sentences) {
            this.sentences.add(i);
        }
    }

    public void addText(Sentence... sentences) {
        for (Sentence i : sentences) {
            this.sentences.add(i);
        }
    }

    public void addSentence(int i, Sentence sentence) {
            this.sentences.add(i, sentence);
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public void showText() {
        System.out.println(paragraph);
        for (Sentence i : sentences) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }
}
