public class ClassWork {
    public static void main(String[] args) {

//        Eagle eagle = new Eagle();
//        eagle.fly();

//        Flying eagle = new Eagle(); // Eagle типа Flying и то же вызваем у него метод Fly. Объекты можно представлять не только по классу (или родительскому классу), но и по интерфейсу которые они имплементируют. НО этому объекту будут доступны только методы этого интерфейса.
//        eagle.fly();

//        Flying[] flyings = {
//                new Eagle(),
//                new PaperPlane(),
//                new SpaceShip()
//        };
//        for (Flying flying : flyings) { // сокращенно iter
//            flying.fly();
//        }

                Flying[] flyings = {
                new Eagle(),
                new PaperPlane(),
                new SpaceShip(),
                        // Вот наш массив, и мы туда подсунули орла, самолет, и корабль (это конкретные классы, в которых много чего прописанно), но что если нам что то конкретное не нужно, а нужно просто какую то летательную логику выполнить с каким то рандомным объектом, который нам лень прописывать и соответственно мы его можем прописать вот так. Так мы объявляем анонимный класс(то есть инстанциировать интерфейс нельзя, но мы можем объявить анонимный класс, которые реализует интерфейс Flying(). В этом интерфейсе есть один абстрактный метод fly() и соответственно тут мы напечатаем что то.
                        new Flying() {
                            @Override
                            public void fly() {
                                System.out.println("Anon fly");
                            }
                        },
                        // Лямбда это на самом деле короткая запись анонимного класса ИЗ ФУНКЦИОНАЛЬНОГО ИНТЕРФЕЙСА. Чтобы можно было анонимный класс превратить в лямбду, этот  анонимный класс должен реализоваывать(имплиминтировать) не абстрактный класс, а именно интерфейс и от также должен реализовавывать так называемый ФУНКЦИОНАЛЬНЫЙ интерфейс. Функциональный интерфейс - это интерфейс, в котором ЕСТЬ ОДИН и ТОЛЬКО ОДИН АБСТРАКТНЫЙ МЕТОД( для проверки есть @FunctionalInterface).
                        () -> System.out.println("Lambda fly")

                        // Как из лямбды получается анонимный интерфейс. У нас есть массив Flying. В него мы можем положить, то что реализаует интерфейс Flying. Мы кладем в него что то конкретное, либо анонимный класс. Ок, мы кладем анонимный интерфейс, и знаем что в нем 1 абстрактный метод, знаем что мы его переопределяем, знаем, ок, убираем переопределение, знаем что это public void fly(), конечно знаем, убираем, скобочки с аргументами мы оставляем, потому что аргументы могут иметь месть быть и реализацию то же оставляем. Просто ставим стрелочку от аргументов к скобочкам... и вот лямбда готова. Если логика в несколько строк то можем писать в скобках, а если логика в одну строку, то можем удалить скобки.

        };
        for (Flying flying : flyings) {
            flying.fly();
        }


    }
}
