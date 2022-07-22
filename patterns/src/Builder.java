
class MobilePhone {
    private String number;
    private int power;
    private String Brand;
    private double size;
    public String getNumber(){
        return number;
    }
    public int getPower(){
        return power;
    }
    public String getBrand(){
        return Brand;
    }
    public double getSize(){
        return size;
    }
    private MobilePhone(Builder builder){
        this.Brand=builder.Brand;
        this.number= builder.number;
        this.power = builder.power;
        this.size = builder.size;
    };
    static class Builder{
        private String number;
        private int power;
        private String Brand;
        private double size;
        public Builder(String Brand){
            this.Brand=Brand;
        }
        public Builder setNumber(String number){
            this.number=number;
            return this;
        }
        public Builder setPower(int power){
            this.power=power;
            return this;
        }
        public Builder setSize(int size){
            this.size=size;
            return this;
        }
        public MobilePhone build() {
            return new MobilePhone(this);
        }
    }
}