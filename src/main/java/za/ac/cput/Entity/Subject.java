package za.ac.cput.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Subject.java
 Class for the subject entity
 Author: Mathew Fortuin -219069514
 Date: 15/03/2022
*/
@Entity
@Table(name = "subject")
public class Subject {


    @Id
    @Column(name = "Subject ID",nullable = false,unique = true,length =25)
    private String subjectID;
    @Column(name = "Subject Name",nullable = false,unique = true,length =50)
    private String subjectName;
    @Column(name = "Subject Credit",nullable = false,unique = true,length =10)
    private Integer subjectCredit;
    @Column(name = "Lecturer ID",nullable = false,unique = true,length =10)
    private String lecturerID;

    public Subject() {

    }

//Builder Constructor

    private Subject(Builder builder) {
        this.subjectName = builder.subjectName;
        this.subjectCredit = builder.subjectCredit;
        this.subjectID = builder.subjectID;
        this.lecturerID = builder.lecturerID;
    }



    //Getters


    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Integer getSubjectCredit() {
        return subjectCredit;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    //Builder Class

    public static class Builder {
        private String subjectID;
        private String subjectName;
        private Integer subjectCredit;
        private String lecturerID;

        //Setters

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectCredit(Integer subjectCredit) {
            this.subjectCredit = subjectCredit;
            return this;
        }

        public Builder setSubjectID(String subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Builder setLecturerID(String lecturerID) {
            this.lecturerID = lecturerID;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }

        public Builder copy(Subject subject) {
            this.subjectID = subject.subjectID;
            this.subjectName = subject.subjectName;
            this.subjectCredit = subject.subjectCredit;
            this.lecturerID = subject.lecturerID;

            return this;
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCredit=" + subjectCredit +
                ", lecturerID='" + lecturerID + '\'' +
                '}';
    }
}