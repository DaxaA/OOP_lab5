package functions;

public interface TabulatedFunction extends Function {
    int getPointsCount();
    FunctionPoint getPoint(int index) throws FunctionPointIndexOutOfBoundsException;
    void setPoint(int index, FunctionPoint point) throws FunctionPointIndexOutOfBoundsException, functions.InappropriateFunctionPointException;
    double getPointX(int index) throws FunctionPointIndexOutOfBoundsException;
    void setPointX(int index, double x) throws FunctionPointIndexOutOfBoundsException, functions.InappropriateFunctionPointException;
    double getPointY(int index) throws FunctionPointIndexOutOfBoundsException;
    void setPointY(int index, double y) throws FunctionPointIndexOutOfBoundsException;
    void deletePoint(int index) throws FunctionPointIndexOutOfBoundsException, IllegalStateException;
    void addPoint(FunctionPoint point) throws functions.InappropriateFunctionPointException;
    Object clone() throws CloneNotSupportedException;
}
