package packer;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Bakery> bakeryBox = new Box<>();
        Box<Pie> pieBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Object> objectBox = new Box<>();

        Food food = new Food();
        foodBox.put(food);

        Pie pie = new Pie();
        pieBox.put(pie);

        Bakery bakery = new Bakery();
        bakeryBox.put(bakery);

        String str = new String();
        stringBox.put(str);

        Object obj = new Object();
        objectBox.put(obj);

        packer.repackage(foodBox, pieBox);

        packer.repackage(foodBox, bakeryBox);

        packer.repackage(objectBox, foodBox);//предупреждение

        packer.repackage(objectBox, stringBox);//предупреждение

//      packer.repackage(pieBox, foodBox);


    }

    public <T> void repackage(Box<? super T> to, Box<? extends T> from) {

        if (!(to.get() instanceof Goods) || !(from.get() instanceof Goods)) {
            System.out.println("Вы упаковываете чтото, что не явлется товаром.");
        }

        to.put(from.get());
    }

}

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

class Goods {
}

class Food extends Goods {
}

class Bakery extends Food {
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}