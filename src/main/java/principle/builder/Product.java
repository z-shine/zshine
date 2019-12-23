package principle.builder;

public class Product
{
    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA)
    {
        this.partA = partA;
    }

    public void setPartB(String partB)
    {
        this.partB = partB;
    }

    public void setPartC(String partC)
    {
        this.partC = partC;
    }

    public void disPlay()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
