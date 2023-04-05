package lesson15.builder;

public class Car {
    private final Body body;
    private final Engine engine;
    private final Wheels wheels;

    private final String title;
    private boolean isEngine = false;

    public Car(String title, Body body, Engine engine, Wheels wheels) {
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
        this.title = title;
    }

    public Body getBody(){
        return body;
    }

    public Engine getEngine(){
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public String getTitle() {
        return title;
    }

    public boolean isEngine() {
        return isEngine;
    }

    /**
     * Запускаем двигатель
     */
    public void startEngine(){
        if(!isEngine){
            engine.on();
            isEngine = true;
        }
    }

    public void stopEngine(){
        if(isEngine){
            engine.off();
            isEngine = false;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль " + title + " состоит из:" +
                "\n" + body +
                "\n" + engine +
                "\n" + wheels +
                "\n" + (isEngine ? "Двигатель запущен" : "Двигатель выключен");

    }

    static class Builder{
        private String title;
        private Body body;
        private Engine engine;
        private Wheels wheels;

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setBody(Body.Color color,Body.Type type){
            body = new Body(color,type);
            return this;
        }
        public Builder setEngine(int power,double volume){
            engine = new Engine(power,volume);
            return this;
        }

        public Builder setWheels(Wheels.Type type,boolean isLowProfile){
            wheels = new Wheels(type,isLowProfile);
            return this;
        }

        /**
         * Получаем готовый авто
         * @return
         */
        public Car build(){
            if(title == null){
                title = "Basic car";
            }
            return new Car(title,body,engine,wheels);
        }
    }
}
