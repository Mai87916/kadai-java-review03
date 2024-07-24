package baseball;

public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;
    private double a;

    public BaseBallTeam() {

        name = "未設定";
        win = 0;
        lose = 0;
        draw = 0;
        a = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public double getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public double getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void getRate() {
        double a = win % ( win + lose );
        System.out.println(a);
    }

    public void report() {

        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分" + "、勝率は0." +  a + "です。");
    }
}
