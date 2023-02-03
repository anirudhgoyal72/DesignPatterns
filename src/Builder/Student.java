package Builder;

import Builder.Exceptions.InvalidPSP;
import Builder.Exceptions.InvalidYearsOfExperience;
import Builder.Exceptions.InvalidYearsOfGradution;

public class Student {
     private String name;
    private int id;
    private int yoe;
    private int gradYear;
    private double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    private String batchName;

    private Student(Builder builder) {

        this.name = builder.name;
        this.id = builder.id;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    public static Builder builder()
    {
        Builder b=new Builder();
        return b;
    }
     static class Builder {
        String name;
        int id;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        int yoe;
        int gradYear;
        double psp;
        String batchName;
        public Student build()
        {
            if(yoe<1)
            {
                throw new InvalidYearsOfExperience();


            }
            if(gradYear<2022)
            {
                throw new InvalidYearsOfGradution();
            }
            if(psp<70)
            {
                throw new InvalidPSP();
            }
            return new Student(this);//object calling this
        }

    }


}
