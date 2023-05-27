import java.util.Scanner;

public class MyListManager {
    public Scanner scanner;
    public MyList<Integer> list = new MyList<>();
    boolean go = true;
    String processId;
    int value;

    public MyListManager(){
        this.scanner = new Scanner(System.in);
    }

    public void startProcess(){
        while (go) {
            System.out.println("-------------| Welcome to Lists |-------------");
            System.out.println("1 - Kapasite Sorgula      2 - Veri Gir");
            System.out.println("3 - Index Sorgula         4 - Index'ten Değiştir");
            System.out.println("5 - Index'ten Kaldır      6 - Diziyi Yazdır");
            System.out.println("7 - Değerden Index bul    8 - Değerin son Indexini bul");
            System.out.println("9 - Dizi durumu sorgula   X - Çıkış yap");
            System.out.println("----------------------------------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz -> ");
            processId = scanner.next().toUpperCase();
            if (processId.equals("X")){
                go = false;
                System.out.println("Görüşmek üzere..");
            }
            switch (processId) {
                case "1":
                    showProcess();
                    break;
                case "2":
                    inputValue();
                    break;
                case "3":
                    findIndex();
                    break;
                case "4":
                    setIndex();
                    break;
                case "5":
                    removeIndex();
                    break;
                case "6":
                    System.out.println(list.toString());
                    break;
                case "7":
                    findValue();
                    break;
                case "8":
                    lastIndex();
                    break;
                case "9":
                    list.isEmpty();
                    break;
            }
        }
    }

    public void inputValue(){
        while (!(value == -1)) {
            System.out.print("Değer giriniz -> ");
            value = scanner.nextInt();
            list.add(value);
        }
    }

    public void lastIndex(){
        System.out.println("Değer giriniz -> ");
        int data = scanner.nextInt();
        list.lastIndexOf(data);
    }

    public void findValue(){
        System.out.print("Değer giriniz -> ");
        int indexOf = scanner.nextInt();
        list.indexOf(indexOf);
    }

    public void removeIndex(){
        System.out.print("Index numarası giriniz ->");
        int removeValue = scanner.nextInt();
        list.remove(removeValue);
    }

    public void findIndex(){
        System.out.print("Index numarası giriniz -> ");
        int getValue = scanner.nextInt();
        System.out.println("Aradığınız : "+list.get(getValue));
    }

    public void setIndex(){
        System.out.print("Index numarası giriniz -> ");
        int setValue = scanner.nextInt();
        System.out.print("Değiştirmek istediğiniz değeri giriniz -> ");
        int changeValue = scanner.nextInt();
        System.out.println("Aradığınız : "+list.set(setValue,changeValue));
    }

    public void showProcess(){
        System.out.println("Eleman Sayısı: " + list.size());
        System.out.println("Kapasite: " + list.getCapacity());
    }
}
