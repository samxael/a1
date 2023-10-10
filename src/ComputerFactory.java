public class ComputerFactory {

    // Статический метод для создания объектов типа Computer в зависимости от указанного типа
    public static Main getComputer(String type, String ram, String hdd, String cpu) {
        // Проверка типа и создание соответствующего объекта
        if("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu); // Создание объекта типа PC с передачей параметров

        else if("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu); // Создание объекта типа Server с передачей параметров

        return null; // Возвращение null, если тип не распознан
    }
}