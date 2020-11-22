public abstract class Animal {
    ////2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void run();
    }
    abstract void swim();
    }
    abstract void jump();
    }
}
