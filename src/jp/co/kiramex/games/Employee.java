package jp.co.kiramex.games;

public class Employee {
        public String employeeName;
        public String divisionName;
        public int vitarity;
        private int vitality;

        public Employee() {
            System.out.println("インスタンス化時にコンストラクタが呼ばれました");
            employeeName = "未設定";
            divisionName = "営業部";
            vitality = 0;
        }

        public Employee(String employeeName, String divisionName, int vitality) {
            System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
            this.employeeName = employeeName;
            this.divisionName = divisionName;
            this.vitality = vitality;
        }

        public void introduce() {
            vitarity = vitarity - 10;
            System.out.println("私の名前は" + employeeName + "です。");
            System.out.println("所属部署は" + divisionName + "です。");
        }

        public void greeting() {
            vitarity = vitarity - 10;
            System.out.println("おはようございます");
        }

        public void report() {
            vitarity = vitarity - 10;
            System.out.println("今日は10件アポイント取りました");
        }

        public void showVitarity() {
            vitarity = vitarity - 10;
            System.out.println("残り体力は" + vitarity);
        }

        public void goToWork() {

        }

        public void leaveWork() {

        }

    }


