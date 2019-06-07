package by.jacviah.jc1.agregation_text.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> sentence = new ArrayList<>();
    private String sign = ".";

    public Sentence(Word... words) {
        for (Word i : words) {
            this.sentence.add(i);
        }
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public String getSign() {
        return sign;
    }

    public boolean setSign(String newSign) {
        for (Sign sign : Sign.values()) {
            if (newSign.equals(sign.getSign())) {
                this.sign = newSign;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List sentence1 = ((Sentence) o).sentence;
        if (sentence.size() != sentence1.size()) {
            return false;
        } else {
            for (int i = 0; i < sentence.size() - 1; i++) {
                if (!sentence.get(i).equals(sentence1.get(i))) {
                    return false;
                }
            }
        }
        if (!sign.equals(((Sentence) o).sign)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < sentence.size() - 1; i++) {
            s += sentence.get(i) + " ";
        }
        return s + sentence.get(sentence.size() - 1) + getSign();
    }
}
