class MySecondClass {
    private int firstNumber;
    private int secondNumber;

    public MySecondClass(int var1, int var2) {
        this.firstNumber = var1;
        this.secondNumber = var2;
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(int var1) {
        this.firstNumber = var1;
    }

    public void setSecondNumber(int var1) {
        this.secondNumber = var1;
    }

    public int getMinimum() {
        return this.firstNumber < this.secondNumber ? this.firstNumber : this.secondNumber;
    }
}
