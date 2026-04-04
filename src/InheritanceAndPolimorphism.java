class Phone {
    private String model;
    public Phone(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void call() {
        System.out.println("Звонок с " + model);
    }
}

class IPhone extends Phone {
    public IPhone(String model) {
        super(model);
    }
    @Override
    public void call() {
        System.out.println("FaceTime звонок с " + getModel());
    }
}

class Samsung extends Phone {
    public Samsung(String model) {
        super(model);
    }
    @Override
    public void call() {
        System.out.println("Google Meet звонок с " + getModel());
    }
}

public class InheritanceAndPolimorphism {
    public static void main(String[] args) {
        Phone myPhone1 = new IPhone ("IPhone 15");
        Phone myPhone2 = new Samsung ("Samsung S24 FE") ;
        myPhone1.call();
        myPhone2.call();
    }
}