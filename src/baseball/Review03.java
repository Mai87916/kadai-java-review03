package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam base01 = new BaseBallTeam();
        base01.setName("東京ヤクルトスワローズ");
        base01.setWin(80);
        base01.setLose(59);
        base01.setDraw(4);
        base01.report();


        BaseBallTeam base02 = new BaseBallTeam();
        base02.setName("横浜DeNAベイスターズ");
        base02.setWin(73);
        base02.setLose(68);
        base02.setDraw(2);
        base02.report();

        BaseBallTeam base03 = new BaseBallTeam();
        base03.setName("阪神タイガース");
        base03.setWin(68);
        base03.setLose(71);
        base03.setDraw(4);
        base03.report();

        BaseBallTeam base04 = new BaseBallTeam();
        base04.setName("読売ジャイアンツ");
        base04.setWin(68);
        base04.setLose(72);
        base04.setDraw(3);
        base04.report();

        BaseBallTeam base05 = new BaseBallTeam();
        base05.setName("広島東洋カープ");
        base05.setWin(66);
        base05.setLose(74);
        base05.setDraw(3);
        base05.report();

        BaseBallTeam base06 = new BaseBallTeam();
        base06.setName("中日ドラゴンズ");
        base06.setWin(66);
        base06.setLose(75);
        base06.setDraw(2);
        base06.report();
    }

}
