package identifyEx;

public class idx extends id{

    private int age;
    private double massIndex;
    private double waterAmount;

    public idx(String name, String surname, int birthYear, double height, double weight) {
        super(name, surname, birthYear, height, weight);
        this.age=age;
        this.massIndex=massIndex;
        this.waterAmount=waterAmount;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 2022-super.getBirthYear();
    }

    public double getMassIndex() {
        return massIndex;
    }

    public void setMassIndex(double massIndex) {
        this.massIndex = super.getWeight()/super.getHeight();
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+
                "Age=" + age +'\n'+
                "Body Mass Index=" + massIndex +'\n'+
                "Water we should drink daily: " + waterAmount ;
    }
}
