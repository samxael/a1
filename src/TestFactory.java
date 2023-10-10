public class TestFactory {
    // Основной метод программы
    public static void main(String[] args) {
        // Создание объекта типа Computer с помощью фабрики
        Main pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Main server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Вывод информации о конфигурации созданных компьютеров
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
