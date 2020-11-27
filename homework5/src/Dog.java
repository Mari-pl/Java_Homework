public class Dog extends Animal {
    //3 У каждого животного есть ограничения на действия
    // (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
    // плавание: кот не умеет плавать, собака 10 м.).
    //    //4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
    //    (Например, dog1.run(150); ->
    //    результат: 'Пёсик пробежал!')
    @Override
    void run(int length) {
        if (length < 500) {
            System.out.println("Собака пробежала" + length + "м");
        } else {
            System.out.println("Собака столько не бежит");
        }
    }
    @Override
    void swim(int length) {
        if (length < 10) {
            System.out.println("Собака проплыла" + length + "м");
        } else {
            System.out.println("Собака столько не плавает");
        }
    }
    @Override
    void jump (int high) {
        if (high < 0.5) {
            System.out.println("Собака прыгнула на" + high + "м");
        }

    }
}

