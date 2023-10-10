// класс PC, который также расширяет абстрактный класс Computer
public class PC extends Main {

    // Поля класса PC, представляющие характеристики компьютера: RAM, HDD и CPU
    private String ram;
    private String hdd;
    private String cpu; // Переменная для хранения информации о CPU, RAM, HDD

    // Конструктор класса PC, принимающий параметры ram, hdd и cpu
    public PC(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu; // Инициализация переменной cpu, ram, hdd
    }

    // Переопределение абстрактного метода getRAM() из класса Computer
    @Override
    public String getRAM() {
        return this.ram; // Возвращает значение переменной ram
    }

    // Переопределение абстрактного метода getHDD() из класса Computer
    @Override
    public String getHDD() {
        return this.hdd; // Возвращает значение переменной hdd
    }

    // Переопределение абстрактного метода getCPU() из класса Computer
    @Override
    public String getCPU() {
        return this.cpu; // Возвращает значение переменной cpu
    }
}
