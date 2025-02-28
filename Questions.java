//This project was created by Julian Reinstein, aka TheRealJReinstein.

public class Questions {
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String correct;

    public Questions(String question, String a, String b, String c, String d, String e, String correct)
    {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.correct = correct;
    }

    public String getCorrect()
    {
        return correct;
    }

    public String toString()
    {
        return question + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    }
}
