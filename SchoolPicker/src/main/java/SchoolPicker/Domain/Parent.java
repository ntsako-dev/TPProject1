package SchoolPicker.Domain;

import java.io.Serializable;
/**
 * Created by Kino on 2017-08-07.
 */
public class Parent implements Serializable
{

    private String name;
    private String surname;
    private String cellphone;
    private String gender;
    private String IDno;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getGender() {
        return gender;
    }

    public String getIDno() {
        return IDno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    private Parent(Builder builder)
    {
        this.IDno = builder.IDno;
        this.name = builder.name;
        this.surname = builder.surname;
        this.cellphone = builder.cellphone;
        this.gender = builder.gender;

    }


        public static class Builder
        {
            private String name, surname, cellphone, gender, IDno;

            public Builder nameVal(String n)
            {
                this.name = n;
                return this;
            }

            public Builder surnameVal(String sn)
            {
                this.surname = sn;
                return this;
            }

            public Builder cellphone(String phone)
            {
                this.cellphone = phone;
                return this;
            }

            public Builder gender(String gen)
            {
                this.gender = gen;
                return this;
            }

            public Builder idno(String id)
            {
                this.IDno = id;
                return this;
            }

            public Parent build()
            {
                return new Parent(this);
            }

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        return IDno.equals(parent.IDno);
    }

    @Override
    public int hashCode() {
        return IDno.hashCode();
    }


}
