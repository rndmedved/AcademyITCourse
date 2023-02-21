package lesson7.innerClass;
//Вложенные классы могут вызывать методы и использовать поля внешнего класса напрямую
//Внешний класс может обращаться к свойствам и методам вложенного класса только через объекты
public class PC {
    private String titlePC;
    private RAM ram;
    private Processor processor;

    public String getTitlePC() {
        return titlePC;
    }

    public RAM getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    class RAM{
        public RAM(String titleRam, int size) {
            this.titleRam = titleRam;
            this.size = size;
        }

        private String titleRam;
        private int size;
        void on(){
            System.out.printf("Модуль RAM %s запущен для ПК %s\n",
                    titleRam, titlePC);
        }
        void off(){
            System.out.printf("Модуль RAM %s выключен для ПК %s\n",
                    titleRam, titlePC);
        }

    }
    class Processor{
        public Processor(String titleProcessor, int size) {
            this.titleProcessor = titleProcessor;
            this.size = size;
        }

        private String titleProcessor;
        private int size;
        void on(){
            System.out.printf("Модуль Processor %s запущен для ПК %s\n",
                    titleProcessor, titlePC);
        }
        void off(){
            System.out.printf("Модуль Processor %s выключен для ПК %s\n",
                    titleProcessor, titlePC);
        }

    }
    void on(){
        ram.on();
        processor.on();
    }
    void off(){
        ram.off();
        processor.off();
    }

    public PC(String titlePC, String titleRam, String titleProcessor,
    int sizeRam, int sizeProcessor) {
        this.titlePC = titlePC;
        this.ram = new RAM(titleRam, sizeRam);
        this.processor = new Processor(titleProcessor, sizeProcessor);
    }

    public PC() {
    }
}
