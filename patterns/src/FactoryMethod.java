//класс, который возвращает сам себя

public class FactoryMethod {


    static class Car {
        private Car() {
            //все, что нужно в классе
        }

        public static Car create() {
            return new Car();
        }
    }
}