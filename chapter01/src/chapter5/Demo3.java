package chapter5;
class Phone {
    private String brand;
    private String type;
    private String os;
    private double price;
    private int memory;
    public Phone() {}
    public Phone(String brand, String type, String os, double price, int memory) {
        this.brand = brand;
        this.type = type;
        this.os = os;
        this.price = price;
        this.memory = memory;
    }
    public void about() {
        //查看手机信息
        System.out.println("品牌: " + brand);
        System.out.println("型号: " + type);
        System.out.println("操作系统: " + os);
        System.out.println("价格: " + price);
        System.out.println("内存: " + memory);
    }
    public void call(String number) {
        System.out.println("使用自动拨号功能：");
        String phoneNumber = null;
        switch (number) {
            case "1":
                phoneNumber = "爷爷的号。";
                break;
            case "2":
                phoneNumber = "奶奶的号。";
                break;
        }
        System.out.println(phoneNumber);
    }
    public void playGame() {
        System.out.println("玩扫雷游戏。");
    }
    public void playMusic(String song) {
        System.out.println("正在播放：" + song);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Phone p1 = new Phone("苹果","iPhoneX","ios",8888,16);
        p1.about();
        p1.call("1");
        p1.playGame();
        p1.playMusic("我的中国心");
        
        System.out.println("*****************************");
        Phone p2 = new Phone("华为", "华为荣耀20", "Android", 6666, 16);
        p2.about();
        p2.call("2");
        p2.playGame();
        p2.playMusic("北京欢迎你");
    }
}