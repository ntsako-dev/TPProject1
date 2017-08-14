package SchoolPicker.Domain;

import java.io.Serializable;

/**
 * Created by Kino on 2017-08-09.
 */
public class Subject implements Serializable
{
    private String subjectId;
    private String subjectName;
    private String subjectDescription;
    private String gradOffered;
    private String aboutSubject;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getGradOffered() {
        return gradOffered;
    }

    public void setGradOffered(String gradOffered) {
        this.gradOffered = gradOffered;
    }

    public String getAboutSubject() {
        return aboutSubject;
    }

    public void setAboutSubject(String aboutSubject) {
        this.aboutSubject = aboutSubject;
    }

    private Subject(Builder builder)
    {
        this.subjectId = builder.subjectId;
        this.subjectName = builder.subjectName;
        this.subjectDescription = builder.subjectDescription;
        this.gradOffered = builder.gradOffered;
        this.aboutSubject = builder.aboutSubject;
    }

    public static class Builder
    {
        private String subjectId, subjectName, subjectDescription, gradOffered, aboutSubject;

        public Builder subjectId(String id)
        {
            this.subjectId = id;
            return this;
        }

        public Builder subjectName(String n)
        {
            this.subjectName = n;
            return this;
        }

        public Builder subjectDescription(String d)
        {
            this.subjectDescription = d;
            return this;
        }

        public Builder gradOffered(String g)
        {
            this.gradOffered = g;
            return this;
        }

        public Builder aboutSubject(String a)
        {
            this.aboutSubject = a;
            return this;
        }

        public Subject build()
        {
            return new Subject(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return subjectId.equals(subject.subjectId);
    }

    @Override
    public int hashCode() {
        return subjectId.hashCode();
    }

}
