package Part4;

class Cho implements DongVat {
    @Override
    public void keu() {
        System.out.println("Woof Woof");
    }
}

class Meo implements DongVat{
    @Override
    public void keu() {
        System.out.println("Meow meow");
    }
}

class Vit implements DongVat{
    @Override
    public void keu() {
        System.out.println("Quack Quack");
    }
}
