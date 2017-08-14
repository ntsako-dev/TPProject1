package SchoolPicker.Domain;

/**
 * Created by Kino on 2017-08-07.
 */
public class SchoolRepresentative
{
    private String name;
    private String surname;
    private String school;
    private String jobType;
    private String repid;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSchool() {
        return school;
    }

    public String getJobType() {
        return jobType;
    }

    public String getRepid() {
        return repid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setRepid(String repid) {
        this.repid = repid;
    }



    private SchoolRepresentative(Builder builder)
    {
        this.repid = builder.repid;
        this.name = builder.name;
        this.surname = builder.surname;
        this.school = builder.school;
        this.jobType = builder.jobType;


    }

    public static class Builder
    {
        private String name, surname, school, jobType, repid;

        public Builder name(String n)
        {
            this.name = n;
            return this;
        }

        public Builder surname(String sn)
        {
            this.surname = sn;
            return this;
        }

        public Builder school(String s)
        {
            this.school = s;
            return this;
        }

        public Builder jobType(String j)
        {
            this.jobType = j;
            return this;
        }

        public Builder repid(String r)
        {
            this.repid = r;
            return this;
        }

        public SchoolRepresentative build()
        {
            return new SchoolRepresentative(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolRepresentative schoolRepresentative = (SchoolRepresentative) o;

        return repid.equals(schoolRepresentative.repid);
    }

    @Override
    public int hashCode() {
        return repid.hashCode();
    }

}
