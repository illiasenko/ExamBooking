package com.solvd.bookexam.additional;

public class Additional {

    private String subject;
    private String time;

    public Additional(String subject, String time) {
        this.subject = subject;
        this.time = time;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public void examination() throws MyException {
        if (subject == null || time == null || subject.isEmpty() || time.isEmpty()) {
            throw new MyException("This date is not available");
        }
        System.out.println("Please choose another date ");

    }
}

