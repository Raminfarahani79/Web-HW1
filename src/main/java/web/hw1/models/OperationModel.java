package web.hw1.models;

public class OperationModel {

    private final String operator;
    private final Integer firstOp;
    private final Integer secondOp;

    public OperationModel(String operator, Integer op1, Integer op2) {
        this.operator = operator;
        this.firstOp = op1;
        this.secondOp = op2;
    }

    public String operate() {
        switch (operator) {
            case "div" -> {
                return (this.firstOp / this.secondOp) + "=" + this.firstOp + "/" + this.secondOp;
            }
            case "plus" -> {
                return (this.firstOp + this.secondOp) + "=" + this.firstOp + "+" + this.secondOp;
            }
            case "subtract" -> {
                return (this.firstOp - this.secondOp) + "=" + this.firstOp + "-" + this.secondOp;
            }
            case "mult" -> {
                return (this.firstOp * this.secondOp) + "=" + this.firstOp + "*" + this.secondOp;
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
